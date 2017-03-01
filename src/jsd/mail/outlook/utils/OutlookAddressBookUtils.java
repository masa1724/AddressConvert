package jsd.mail.outlook.utils;

import java.util.LinkedList;
import java.util.List;

import jsd.mail.alphamail.AlphaMailAddressBook;
import jsd.mail.outlook.Address;
import jsd.mail.outlook.EmailAddress;
import jsd.mail.outlook.OutlookAddressBook;
import jsd.mail.outlook.TelePhoneNumberList;

/**
 * Outlookのアドレス帳に関連する処理を行います.
 * 
 */
public class OutlookAddressBookUtils {	
	/**
	 * アルファメールのアドレス帳BeanをOutlookのアドレス帳Beanへ変換し、返却する.
	 * 
	 * @param alphaMailAddrBookList アルファメールのアドレス帳Beanのリスト
	 * @return 変換後のOutlookのアドレス帳Beanのリスト
	 * 
	 * @see jsd.mail.outlook.OutlookAddressBook
	 * @see jsd.mail.alphamail.AlphaMailAddressBook
	 */
	public static List<OutlookAddressBook> toOutlookAddressBookList(List<AlphaMailAddressBook> alphaMailAddrBookList) {
		List<OutlookAddressBook> olAddrBookList = new LinkedList<OutlookAddressBook>(); 
		
		for(AlphaMailAddressBook amab : alphaMailAddrBookList) {
			olAddrBookList.add(toOutlookAddressBook(amab));
		}
		
		return olAddrBookList;
	}
	
	/**
	 * アルファメールのアドレス帳BeanをOutlookのアドレス帳Beanへ変換し、返却する.
	 * 
	 * @param alphaMailAddrBookList アルファメールのアドレス帳Bean
	 * @return 変換後のOutlookのアドレス帳Beanのリスト
	 * 
	 * @see jsd.mail.outlook.OutlookAddressBook
	 * @see jsd.mail.alphamail.AlphaMailAddressBook
	 */
	public static OutlookAddressBook toOutlookAddressBook(AlphaMailAddressBook alphaMailAddrBook) {
		OutlookAddressBook.Builder olAddrBookBuilder = 
				new OutlookAddressBook.Builder();
		
		olAddrBookBuilder
			.setFirstName(alphaMailAddrBook.getName())
			.setLastName(alphaMailAddrBook.getName())
			.setCompanyName(alphaMailAddrBook.getOrganization())
			.setDepartment(alphaMailAddrBook.getDepartment())
			.setJobTitle(alphaMailAddrBook.getJobTitle());
		
		//----------------------------------------------------------------
		// 住所
		//----------------------------------------------------------------
		Address companyAddr = new Address.Builder()
				.setAddress(alphaMailAddrBook.getAddress())
				.setCity(alphaMailAddrBook.getCity())
				.setState(alphaMailAddrBook.getState())
				.setZipCode(alphaMailAddrBook.getZipCode())
				.setCountry(alphaMailAddrBook.getCountry())
				.build();
			
		olAddrBookBuilder.setCompanyAddress(companyAddr);
		
		//----------------------------------------------------------------
		// 電話番号リスト
		//----------------------------------------------------------------
		TelePhoneNumberList telNoList = new TelePhoneNumberList.Builder()
				.setCompanyFaxNumber(alphaMailAddrBook.getFax())
				.setCellPhoneNumber(alphaMailAddrBook.getTel1())
				.setCompanyTelePhoneNumber(alphaMailAddrBook.getTel2())
				.setCompanyTelePhoneNumber2(alphaMailAddrBook.getTel3())
				.build();
		
		olAddrBookBuilder.setTelePhoneNumberList(telNoList);
		
		//----------------------------------------------------------------
		// Email
		//----------------------------------------------------------------
		EmailAddress emailAddr = new EmailAddress.Builder()
				.setEmail(alphaMailAddrBook.getEmail())
				.setType(EmailAddress.DEFAULT_EMAIL_TYPE)
				.setViewName(alphaMailAddrBook.getName(), alphaMailAddrBook.getEmail())
				.build();
		
		olAddrBookBuilder.setEmailAddress1(emailAddr);
		
		olAddrBookBuilder
			.setWebPage(alphaMailAddrBook.getUrl())
		    .setMemo(alphaMailAddrBook.getMemo())
			.setFirstNameKana(alphaMailAddrBook.getHurigana())
			.setLastNameKana(alphaMailAddrBook.getHurigana());
		
		return olAddrBookBuilder.build();
	}
}
