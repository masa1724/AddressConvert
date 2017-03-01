package jsd.csv;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import jsd.csv.annotation.CSVColumn;
import jsd.csv.annotation.EmptyStringQuote;
import jsd.csv.annotation.Trim;

/**
 * CSVファイルの出力を行います.
 *
 */
public class CSVWriter {
	private String lineSeparator = System.getProperty("line.separator");
	private String delimiter = ",";
	private boolean isEmptyStringQuote = true;
	private boolean isTrim = false;
	private String quoteString = "\"";
	
	private PrintWriter _writer;
	
	public CSVWriter(Writer writer) {
		_writer = new PrintWriter(new BufferedWriter(writer));
	}
	
	/**
	 * リストに格納されているBeanオブジェクトの中身をファイルへ出力します. 
	 * 
	 * @param <T>
	 * @param beans
	 * @param filePath
	 * @param headers
	 * @throws UnsupportedEncodingException
	 * @throws FileNotFoundException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public <T> void writeAll(String[] headers,
							 List<T> beans) 
							 throws UnsupportedEncodingException, 
									FileNotFoundException, 
									IllegalArgumentException, 
									IllegalAccessException {
		// ヘッダー部の出力
		write(headers);
		
		// ボディ部の出力
		for(int i = 0; i < beans.size(); i++) {
			write(beans.get(i));
		}
	}
	
	/**
	 */
	public void write(String[] columns) {
		StringBuffer buffer = createColumnLine(columns);
		buffer.append(lineSeparator);
		_writer.print(buffer.toString());
	}
	
	/**
	 * Beanオブジェクトの中身をファイルへ出力します.
	 * 
	 * @param bean Beanオブジェクト
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public <T> void write(T bean) throws IllegalArgumentException, IllegalAccessException {
		StringBuffer csvBody = new StringBuffer();
		Map<Integer,Object> columns = new TreeMap<Integer,Object>();
		
		createBodyRecursive(bean, columns, new TreeMap<Integer,Object>(), 0);
		createBodyLine(columns, csvBody);
		csvBody.append(lineSeparator);
		
		// ファイル出力
		_writer.print(csvBody.toString());
	}
	
	/**
	 * 
	 * @param columns
	 * @return 
	 */
	private StringBuffer createColumnLine(String [] columns) {
		StringBuffer buffer = new StringBuffer();
		
		for(int i = 0; i < columns.length; i++) {
			buffer.append(columns[i]);
			
			if(i != columns.length - 1) {
				buffer.append(delimiter);
			}
		}
		
		return buffer;
	}
	
	/**
	 * CSVのボディ部を生成します.
	 * 
	 * @param bean 出力対象のオブジェクト
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	private <T> void createBodyRecursive(T bean, 
									 Map<Integer,Object> parentColumns, 
									 Map<Integer,Object> columns, 
									 int index) throws IllegalArgumentException, IllegalAccessException {
		Class cls = bean.getClass();
		
		// フィールドを取得
		Field fields[] = cls.getDeclaredFields();
		
		// フィールドを1つずつ取り出す
		for(int i = 0; i < fields.length; i++){
			fields[i].setAccessible(true);
			CSVColumn expOrderAno = fields[i].getDeclaredAnnotation(CSVColumn.class);
			
			// CSVExportOrder注釈が指定されていない場合は
			// 非対象フィールドとする.
			if(expOrderAno != null) {
				// ValueObjectの場合は、再帰的に呼び出す. 
				if(expOrderAno.isEntity()) {
					createBodyRecursive(fields[i].get(bean), columns, new TreeMap<Integer,Object>(), i);
					continue;
				}
				
				columns.put(expOrderAno.index(),quote(fields[i].get(bean), expOrderAno.quote(), fields[i]));
				
				/*
				StringBuffer sb = new StringBuffer();
				sb.append("field = " + field.getName());
				sb.append(", value = " + columns[expOrderAno.no()]);
				sb.append(", no = " + expOrderAno.no());
				sb.append(", quote = " + expOrderAno.quote());
				System.out.println(sb.toString());
				*/
			}
			
			parentColumns.put(index, columns);
		}
	}
	
	/**
	 * CSVのボディ部の生成を行います.
	 * 
	 * @param colmuns
	 * @param buffer
	 */
	private void createBodyLine(Map<Integer,Object> colmuns, StringBuffer buffer) {
        Iterator<Integer> it = colmuns.keySet().iterator();
        
        while (it.hasNext()) {
            int key = it.next();
            Object map = colmuns.get(key);
            
            if(map.getClass() == java.util.TreeMap.class) {
            	//System.out.println("■■■ " + obj.getClass().getName() + " ■■■");
            	createBodyLine((Map<Integer,Object>)map, buffer);
            } else {
            	//System.out.println(key + "=" + String.valueOf(colmuns.get(key)));
            	buffer.append(String.valueOf(colmuns.get(key))).append(delimiter);
            }
        }
        
        // 末尾の不要なカンマを削除
        buffer.deleteCharAt(buffer.length()-1);
        
        /*
		for(int i = 0; i < sortedColumns.size(); i++) {
			buffer.append(sortedColumns.get(i));
			
			if(i != sortedColumns.size() - 1) {
				buffer.append(delimiter);
			}
		}*/
	}
	
	/**
	 * フィールドをクォート文字で囲む対象か判断し、
	 * 対象の場合は、クォート文字で囲んだ文字列を返却します.
	 * 
	 * @param obj 対象フィールドのオブジェクト
	 * @param quote クォート制御フラグ
	 * @param cls Fieldオブジェクト
	 * @return 文字列
	 */
	private String quote(Object obj, int quote, Field field) {
		Class cls = obj.getClass();		
		
		StringBuffer buffer = new StringBuffer();
		String value = "";
		
		if(obj != null) {
			try {
				value = String.valueOf(obj);
			} catch (Exception e) {
				value = obj.toString();
			}
		}
		
		if (isTrim(field.getDeclaredAnnotation(Trim.class))) {
			value = value.trim();
		}
		
		switch (quote) {
		// OFFなら囲まない
		case CSVColumn.QUATE_OFF:
			return value;
		// ONなら囲む
		case CSVColumn.QUATE_ON:
			return buffer.append(quoteString).append(value).append(quoteString).toString();
		case CSVColumn.QUATE_AUTO:
			if(isQuote(value, cls, field.getDeclaredAnnotation(EmptyStringQuote.class))) {
				return buffer.append(quoteString).append(value).append(quoteString).toString();
			} else {
				return value;
			}
		default:
			throw new IllegalArgumentException("クウォートフラグに異常値が設定されています.必ず、" + 
												CSVColumn.class.getName() + 
		                            			"の定数を使用して下さい.");
		}
	}
	
	/**
	 * ストリームを閉じて、それに関連するすべてのシステム・リソースを解放します.
	 * 
	 */
	public void close() {
		_writer.close();
	}
	
	/**
	 * ストリームをフラッシュします.
	 * 
	 */
	public void flush() {
		_writer.flush();
	}
	
	/**
	 * クォート文字で囲む対象か判定します.<br>
	 * 
	 * @param value 対象フィールドの値
	 * @param cls 対象フィールドのClassオブジェクト
	 * @param nesq 空文字フィールドのクォート制御アノテーション
	 * @return
	 */
	private boolean isQuote(String value, Class cls, EmptyStringQuote nesq) {
		// EmptyStringQuote注釈を指定しており、かつ空文字の場合、
		// 注釈に設定されている値を優先する
		if(nesq != null && value.length() == 0) {
			if(nesq.quote()) {
				return true;
			} else {
				return false;
			}
		}
		
		if(!isEmptyStringQuote && value.length() == 0) {
			return false;
		}
		
		return isAutoQuote(cls);
	}
	
	/**
	 * フィールドをクォート文字で囲むか、クラスの型を元に判定します.<br>
	 * 現状は、java.lang.String.classの場合true、それ以外はfalseを返します.
	 * 
	 * @param cls 対象フィールドのClassオブジェクト
	 * @return フィールドをクォート文字で 囲む(true) 囲まない(false)
	 */
	private boolean isAutoQuote(Class cls) {
		if (cls == java.lang.String.class) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * フィールドをトリムするか判定します.<br>
	 * 
	 * @param trimAno トリム制御アノテーション
	 * @return フィールドをトリム する(true) しない(false)
	 */
	private boolean isTrim(Trim trimAno) {
		// Trim注釈をしている場合、注釈に設定されている値を優先する
		if(trimAno != null) {
			if(trimAno.trim()) {
				return true;
			} else {
				return false;
			}
		}
		
		if (isTrim) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * CSVファイル出力時の改行コードを設定します.<br>
	 * デフォルト値：System.getProperty("line.separator")
	 * 
	 * @param delimiter 区切り文字
	 */
	public void setLineSeparator(String lineSeparator) {
		this.lineSeparator = lineSeparator;
	}
	
	/**
	 * CSVファイル出力時の区切り文字を設定します.<br>
	 * デフォルト値：カンマ(,)
	 * 
	 * @param delimiter 区切り文字
	 */
	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}
	
	/**
	 * フィールドが空文字の場合、クォート文字で囲むかどうか設定します.<br>
	 * デフォルト値：true<br><br>
	 * 
	 * この項目にtrueが設定されている場合、オートクォーテーションルールに従い、クォートが行われます.<br>
	 *
	 * 逆にfalseが設定されている場合、全てのフィールドに対して、<br>
	 * フィールドが空文字の場合はクォート文字で囲いません.<br><br>
	 * 
	 * ただし、EmptyStringQuote注釈を指定しているフィールドについては注釈に設定されている値が優先されます.
	 * 
	 * @param isEmptyStringQuote 空文字の場合、クォート文字で 囲む(true) 囲まない(false)
	 * @see EmptyStringQuote
	 */
	public void setEmptyStringQuate(boolean isEmptyStringQuote) {
		this.isEmptyStringQuote = isEmptyStringQuote;
	}
	
	/**
	 * フィールドをトリムするか設定します.<br>
	 * デフォルト値：false<br><br>
	 * 
	 * この項目にtrueが設定されている場合、全てのフィールドに対してTrimを行います.<br>
	 * ただし、Trim注釈を指定しているフィールドについては注釈に設定されている値が優先されます.
	 * 
	 * @param isTrim 文字列をトリムするか true(トリムする) false(トリムしない)
	 * @see Trim
	 */
	public void setIsTrim(boolean isTrim) {
		this.isTrim = isTrim;
	}
	
	/**
	 * 文字列を囲むクォート文字を設定します.<br>
	 * デフォルト値：ダブルクォテーション(")
	 * 
	 * @param quoteString クォート文字
	 */
	public void setQuoteString(String quoteString) {
		this.quoteString = quoteString;
	}
}
