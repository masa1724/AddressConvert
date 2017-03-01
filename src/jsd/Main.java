package jsd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import jsd.csv.CSVWriter;
import jsd.mail.alphamail.AlphaMailAddressBook;
import jsd.mail.alphamail.AlphaMailAddressBookFactory;
import jsd.mail.outlook.OutlookAddressBook;
import jsd.mail.outlook.utils.OutlookAddressBookUtils;

public class Main {
	public static void main(String[] args) {
		/*
		if(args.length == 0 || "".equals(args[0])) {
			System.out.println("ファイルパスが指定されていません.");
			return;
		}
		
		String filePath = args[0].trim();
		*/
		
		long start = System.nanoTime();
		
		String filePath = RESOURCE_DIR + "addrbook9.xml";
		
		// アルファメールのアドレス帳のXMLファイル
		File alphaMailAddrXMLFile = new File(filePath);
		
		// アルファメールでエクスポートをしたxmlファイルから
		// アルファメールのアドレス帳Beanオブジェクトへ変換
		List<AlphaMailAddressBook> alphaMailAddrList;
		try {
			alphaMailAddrList = 
					AlphaMailAddressBookFactory.createMailAddressListFromXML(new FileInputStream(alphaMailAddrXMLFile));
		} catch (ParserConfigurationException | SAXException | IOException e) {
			System.out.println("アルファメールのアドレス帳のXMLファイル読込中にエラーが発生しました.");
			e.printStackTrace();
			return;
		}
		
		// エクスポート件数が0件の場合は、処理を中断
		if(alphaMailAddrList.size() == 0) {
			System.out.println("エクスポートされているアドレスは0件です.");
			return;
		}
		
		/*
		for(AlphaMailAddressBook mailAddr : alphaMailAddrList) {
			System.out.println(mailAddr);
		}
		*/
		
		// アルファメールのアドレス帳をOutlookのアドレス帳へ変換
		List<OutlookAddressBook> outlookMailAddrList =
				OutlookAddressBookUtils.toOutlookAddressBookList(alphaMailAddrList);
	
		/*
		for(OutlookAddressBook mailAddr : olMailAddrList) {
			System.out.println(mailAddr);
		}
		*/
		
		CSVWriter csvWriter = null;
		
		try {
			Writer osw = 
					new OutputStreamWriter(new FileOutputStream(new File(RESOURCE_DIR + OUTLOOK_ADDRESS_BOOK_CSV_DEFAULT_NAME)), FILE_ENCODING);
			
			csvWriter = new CSVWriter(osw);
			csvWriter.setEmptyStringQuate(false);
			
			csvWriter.writeAll(OUTLOOK_ADDRESS_BOOK_CSV_HEADER, outlookMailAddrList);
			csvWriter.close();
			
		} catch (UnsupportedEncodingException | FileNotFoundException | IllegalArgumentException | IllegalAccessException e) {
			if(csvWriter != null) {
				csvWriter.close();
			}
			e.printStackTrace();
		}
		
		System.out.println("処理が完了しました.");
		System.out.println(outlookMailAddrList.size() + "レコード");
		System.out.println("Time:" + (System.nanoTime() - start) / 1000000f + "ms");
	}
	
	public static final String RESOURCE_DIR = "C:\\Users\\sgym2835win\\workspace_item_holder\\Mail\\resource\\";
	
	/** ファイルエンコード */
	public static final String FILE_ENCODING = "Shift-JIS";
	
	/** CSVファイル名(デフォルト) */
	public static String OUTLOOK_ADDRESS_BOOK_CSV_DEFAULT_NAME = "outlook-addrbook.csv";
	
	/** CSVヘッダー */
	public static String[] OUTLOOK_ADDRESS_BOOK_CSV_HEADER = {
			"\"肩書き\"",
			"\"名\"",
			"\"ミドル ネーム\"",
			"\"姓\"",
			"\"敬称\"",
			"\"会社名\"",
			"\"部署\"",
			"\"役職\"",
			"\"番地 (会社)\"",
			"\"住所 2 (会社)\"",
			"\"住所 3 (会社)\"",
			"\"市町村 (会社)\"",
			"\"都道府県 (会社)\"",
			"\"郵便番号 (会社)\"",
			"\"国 (会社)/地域\"",
			"\"番地 (自宅)\"",
			"\"住所 2 (自宅)\"",
			"\"住所 3 (自宅)\"",
			"\"市町村 (自宅)\"",
			"\"都道府県 (自宅)\"",
			"\"郵便番号 (自宅)\"",
			"\"国 (自宅)/地域\"",
			"\"番地 (その他)\"",
			"\"住所 2 (その他)\"",
			"\"住所 3 (その他)\"",
			"\"市町村 (その他)\"",
			"\"都道府県 (その他)\"",
			"\"郵便番号 (その他)\"",
			"\"国 (その他)/地域\"",
			"\"秘書の電話\"",
			"\"会社 FAX\"",
			"\"会社電話\"",
			"\"会社電話 2\"",
			"\"コールバック\"",
			"\"自動車電話\"",
			"\"会社代表電話\"",
			"\"自宅 FAX\"",
			"\"自宅電話\"",
			"\"自宅電話 2\"",
			"\"ISDN\"",
			"\"携帯電話\"",
			"\"その他の FAX\"",
			"\"その他の電話\"",
			"\"ポケットベル\"",
			"\"通常の電話\"",
			"\"無線電話\"",
			"\"TTY/TDD\"",
			"\"テレックス\"",
			"\"ID 番号\"",
			"\"Web ページ\"",
			"\"アカウント\"",
			"\"イニシャル\"",
			"\"インターネット空き時間情報\"",
			"\"キーワード\"",
			"\"その他住所私書箱\"",
			"\"ディレクトリ サーバー\"",
			"\"プライベート\"",
			"\"マネージャー\"",
			"\"メモ\"",
			"\"ユーザー 1\"",
			"\"ユーザー 2\"",
			"\"ユーザー 3\"",
			"\"ユーザー 4\"",
			"\"会社 ID\"",
			"\"会社住所私書箱\"",
			"\"会社名フリガナ\"",
			"\"記念日\"",
			"\"経費情報\"",
			"\"言語\"",
			"\"参照事項\"",
			"\"子供\"",
			"\"支払い条件\"",
			"\"事業所\"",
			"\"自宅住所私書箱\"",
			"\"趣味\"",
			"\"場所\"",
			"\"職業\"",
			"\"姓フリガナ\"",
			"\"性別\"",
			"\"誕生日\"",
			"\"電子メール アドレス\"",
			"\"電子メールの種類\"",
			"\"電子メール表示名\"",
			"\"電子メール 2 アドレス\"",
			"\"電子メール 2 の種類\"",
			"\"電子メール 2 表示名\"",
			"\"電子メール 3 アドレス\"",
			"\"電子メール 3 の種類\"",
			"\"電子メール 3 表示名\"",
			"\"配偶者\"",
			"\"秘書の氏名\"",
			"\"秘密度\"",
			"\"分類\"",
			"\"名前フリガナ\"",
			"\"優先度\""
	};
}
