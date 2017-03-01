package jsd.csv.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

/**
 * 
 * CSV項目の出力について、設定を行います.
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface CSVColumn {
	public static final int QUATE_OFF = 0;
	public static final int QUATE_ON = 1;
	public static final int QUATE_AUTO = 2;
	
	/** CSVの出力順 */
	int index();
	
	/** 
	 * 対象フィールドをクォート文字で囲むか設定します.<br>
	 * 囲む(true) 囲まない(false)<br><br>
	 *  
	 * CSVColumn.AUTOが設定された場合、対象フィールドの型がjava.lang.Stringの場合true<br>
	 * それ以外の場合はfalseが設定されます.
	 * 
	 */
	int quote() default QUATE_AUTO;
	
	boolean isEntity() default false;
}