package jsd.mail.alphamail;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * アルファメールのアドレス帳Beanオブジェクトの生成を行います.
 * @see jsd.mail.alphamail.AlphaMailAddressBook
 */
public class AlphaMailAddressBookFactory {
	/**
	 * アルファメールからエクスポートした連絡先情報ファイル(xmlファイル)を<br>
	 * アルファメールアドレス帳Beanオブジェクトに変換して返却します.
	 * 
	 * @param file アルファメールからエクスポートした連絡先情報ファイル(xmlファイル)
	 * @return アルファメールのアドレス帳Beanオブジェクトのリスト
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws SAXException
	 */
	public static List<AlphaMailAddressBook> createMailAddressListFromXML(InputStream xmlStream) throws ParserConfigurationException, SAXException, IOException {
		// ドキュメントファクトリーの生成 
		DocumentBuilderFactory documentbuilderfactory = DocumentBuilderFactory.newInstance();
		
		// コメントを無視(デフォルト値:false)
		documentbuilderfactory.setIgnoringComments(true);
		
		// 返却用のアドレスリスト
		List<AlphaMailAddressBook> addrBookList = new LinkedList<AlphaMailAddressBook>();
		
		// ドキュメントビルダーの生成 
		DocumentBuilder documentbuilder = documentbuilderfactory.newDocumentBuilder();
			
		// Documentオブジェクトへparseする
		Document document = documentbuilder.parse(xmlStream);
			
		// ルートノード(Workbook)を取得
		Element workbookElement = document.getDocumentElement();
			
		// WorkbookノードからWorksheetノードを取得
		Node workSheetNode = 
					workbookElement.getElementsByTagName("Worksheet").item(0);			
			
		// WorksheetノードからTableノードを取得
		Node tableNode = 
					((Element) workSheetNode).getElementsByTagName("Table").item(0);
			
		// TableノードからRowノードを取得
		NodeList rowNodes = 
				((Element) tableNode).getElementsByTagName("Row");
			
		// Rowノードの数が1つ以下の場合は
		// アドレス出力無しと判断し、呼出し元へ返す
		//  => Rowノードの1つ目は実際の値でなくカラム名が出力されているため.
		if(rowNodes.getLength() <= 1) {
			return addrBookList;
		}
			
		// Rowノードを1つずつ取り出す
		for(int i = 1; i < rowNodes.getLength(); i++) {
			// RowノードからCellノードを取得
			NodeList cellNodes = 
					((Element) rowNodes.item(i)).getElementsByTagName("Cell");
				
			// CellノードからDataノードを取り出し、Beanへ設定
			AlphaMailAddressBook mailAddr = new AlphaMailAddressBook.Builder()
					.setHurigana(putDataNodeText(cellNodes, 0))
					.setName(putDataNodeText(cellNodes, 1))
					.setEmail(putDataNodeText(cellNodes, 2))
					.setOrganization(putDataNodeText(cellNodes, 3))
					.setDepartment(putDataNodeText(cellNodes, 4))
					.setJobTitle(putDataNodeText(cellNodes, 5))
					.setTel1(putDataNodeText(cellNodes, 6))
					.setTel2(putDataNodeText(cellNodes, 7))
					.setTel3(putDataNodeText(cellNodes, 8))
					.setFax(putDataNodeText(cellNodes, 9))
					.setCountry(putDataNodeText(cellNodes, 10))
					.setZipCode(putDataNodeText(cellNodes, 11))
					.setState(putDataNodeText(cellNodes, 12))
					.setCity(putDataNodeText(cellNodes, 13))
					.setAddress(putDataNodeText(cellNodes, 14))
					.setUrl(putDataNodeText(cellNodes, 15))
					.setMemo(putDataNodeText(cellNodes, 16))
					.setAddrpath(putDataNodeText(cellNodes, 17))
					.setExtField1(putDataNodeText(cellNodes, 18))
					.setExtField2(putDataNodeText(cellNodes, 19))
					.setExtField3(putDataNodeText(cellNodes, 20))
					.build();
		
			addrBookList.add(mailAddr);
		}
		
		return addrBookList;
	}
	
	/**
	 * RowノードからDataノードを取り出し、Textを取得します.<br>
	 * Textがnullの場合は、空文字に変換し返却します.
	 * 
	 * @param nodeList Rowノード
	 * @param index インデックス
	 * @return DataノードのText
	 */
	private static String putDataNodeText(NodeList nodeList, int index) {
		Node n = 
			((Element) nodeList.item(index)).getElementsByTagName("Data").item(0);
		return n.getTextContent() == null ? "" : n.getTextContent();
	}
}
