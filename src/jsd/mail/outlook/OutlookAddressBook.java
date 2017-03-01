package jsd.mail.outlook;

import jsd.csv.annotation.CSVColumn;

/**
 * <b>以下のOutlookアドレス情報を格納します.</b>
 * 
 * <pre>
 * 肩書き title
 * 氏名(名) firstName
 * ミドル ネーム middleName
 * 氏名(姓) lastName
 * 敬称 honorific
 * 会社名 companyName
 * 部署 department
 * 役職 jobTitle
 * 住所(会社) companyAddress
 * 住所(自宅) homeAddress
 * 住所(その他) etcAddress
 * 電話番号リスト telePhoneNumberList
 * ID 番号 idNumber
 * Web ページ webPage
 * アカウント account
 * イニシャル initial
 * インターネット空き時間情報 internetFreeTimeInfo
 * キーワード keyword
 * その他住所私書箱 etcPostOfficeBox
 * ディレクトリ サーバー directoryServer
 * プライベート isPrivate
 * マネージャー manager
 * メモ memo
 * ユーザー 1 user1
 * ユーザー 2 user2
 * ユーザー 3 user3
 * ユーザー 4 user4
 * 会社 ID companyId
 * 会社住所私書箱 companyPostOfficeBox
 * 会社名フリガナ companyNameKana
 * 記念日 companyAnniversary
 * 経費情報 companyExpenseInfo
 * 言語 language
 * 参照事項 sansyo
 * 子供 children
 * 支払い条件 companyPaymentConditions
 * 事業所 office
 * 自宅住所私書箱 postOfficeBox
 * 趣味 hobby
 * 場所 place
 * 職業 jobName
 * 姓フリガナ firstNameKana
 * 性別 sex
 * 誕生日 birthday
 * 電子メール アドレス1 emailAddress1
 * 電子メール アドレス2 emailAddress2
 * 電子メール アドレス3 emailAddress3
 * 配偶者 spouse
 * 秘書の氏名 secretaryFullName
 * 秘密度 sensitivity
 * 分類 category
 * 名前フリガナ lastNameKana
 * 優先度 priority
 * </pre>
 * 
 * @see jsd.mail.outlook.Address 住所情報
 * @see jsd.mail.outlook.EmailAddress Emailアドレス情報
 * @see jsd.mail.outlook.TelePhoneNumberList 電話番号リスト
 */
public class OutlookAddressBook {
	/** 肩書き */
	@CSVColumn(index = 0)
	private final String title;
	/** 氏名(名) */
	@CSVColumn(index = 1)
	private final String firstName;
	/** ミドル ネーム */
	@CSVColumn(index = 2)
	private final String middleName;
	/** 氏名(姓) */
	@CSVColumn(index = 3)
	private final String lastName;
	/** 敬称 */
	@CSVColumn(index = 4)
	private final String honorific;
	/** 会社名 */
	@CSVColumn(index = 5)
	private final String companyName;
	/** 部署 */
	@CSVColumn(index = 6)
	private final String department;
	/** 役職 */
	@CSVColumn(index = 7)
	private final String jobTitle;
	
	/** 住所(会社) */
	@CSVColumn(index = 8, isEntity = true)
	private final Address companyAddress;
	/** 住所(自宅) */
	@CSVColumn(index = 9, isEntity = true)
	private final Address homeAddress;
	/** 住所(その他) */
	@CSVColumn(index = 10, isEntity = true)
	private final Address etcAddress;
	
	/** 電話番号リスト */
	@CSVColumn(index = 11, isEntity = true)
	private final TelePhoneNumberList telePhoneNumberList;
	
	/** ID 番号 */
	@CSVColumn(index = 12)
	private final String idNumber;
	/** Web ページ */
	@CSVColumn(index = 13)
	private final String webPage;
	@CSVColumn(index = 14)
	/** アカウント */
	private final String account;
	/** イニシャル */
	@CSVColumn(index = 15)
	private final String initial;
	/** インターネット空き時間情報 */
	@CSVColumn(index = 16)
	private final String internetFreeTimeInfo;
	/** キーワード */
	@CSVColumn(index = 17)
	private final String keyword;
	/** その他住所私書箱 */
	@CSVColumn(index = 18)
	private final String etcPostOfficeBox;
	/** ディレクトリ サーバー */
	@CSVColumn(index = 19)
	private final String directoryServer;
	/** プライベート */
	@CSVColumn(index = 20)
	private final String isPrivate;
	/** マネージャー */
	@CSVColumn(index = 21)
	private final String manager;
	/** メモ */
	@CSVColumn(index = 22)
	private final String memo;
	/** ユーザー 1 */
	@CSVColumn(index = 23)
	private final String user1;
	/** ユーザー 2 */
	@CSVColumn(index = 24)
	private final String user2;
	/** ユーザー 3 */
	@CSVColumn(index = 25)
	private final String user3;
	/** ユーザー 4 */
	@CSVColumn(index = 26)
	private final String user4;
	/** 会社 ID */
	@CSVColumn(index = 27)
	private final String companyId;
	/** 会社住所私書箱 */
	@CSVColumn(index = 28)
	private final String companyPostOfficeBox;
	/** 会社名フリガナ */
	@CSVColumn(index = 29)
	private final String companyNameKana;
	/** 記念日 */
	@CSVColumn(index = 30)
	private final String companyAnniversary;
	/** 経費情報 */
	@CSVColumn(index = 31)
	private final String companyExpenseInfo;
	/** 言語 */
	@CSVColumn(index = 32)
	private final String language;
	/** 参照事項 */
	@CSVColumn(index = 33)
	private final String sansyo;
	/** 子供 */
	@CSVColumn(index = 34)
	private final String children;
	/** 支払い条件 */
	@CSVColumn(index = 35)
	private final String companyPaymentConditions;
	/** 事業所 */
	@CSVColumn(index = 36)
	private final String office;
	/** 自宅住所私書箱 */
	@CSVColumn(index = 37)
	private final String postOfficeBox;
	/** 趣味 */
	@CSVColumn(index = 38)
	private final String hobby;
	/** 場所 */
	@CSVColumn(index = 39)
	private final String place;
	/** 職業 */
	@CSVColumn(index = 40)
	private final String jobName;
	/** 姓フリガナ */
	@CSVColumn(index = 41)
	private final String firstNameKana;
	/** 性別 */
	@CSVColumn(index = 42)
	private final String sex;
	/** 誕生日 */
	@CSVColumn(index = 43)
	private final String birthday;
	
	/** 電子メール アドレス1 */
	@CSVColumn(index = 44, isEntity = true)
	private final EmailAddress emailAddress1;
	/** 電子メール アドレス2 */
	@CSVColumn(index = 45, isEntity = true)
	private final EmailAddress emailAddress2;
	/** 電子メール アドレス3 */
	@CSVColumn(index = 46, isEntity = true)
	private final EmailAddress emailAddress3;

	/** 配偶者 */
	@CSVColumn(index = 47)
	private final String spouse;
	/** 秘書の氏名 */
	@CSVColumn(index = 48)
	private final String secretaryFullName;
	/** 秘密度 */
	@CSVColumn(index = 49)
	private final String sensitivity;
	/** 分類 */
	@CSVColumn(index = 50)
	private final String category;
	/** 名前フリガナ */
	@CSVColumn(index = 51)
	private final String lastNameKana;
	/** 優先度 */
	@CSVColumn(index = 100)
	private final String priority;
	
	private OutlookAddressBook(String title, String firstName, String middleName, String lastName, String honorific,
			String companyName, String department, String jobTitle, Address companyAddress, Address homeAddress,
			Address etcAddress, TelePhoneNumberList telePhoneNumberList, String idNumber, String webPage,
			String account, String initial, String internetFreeTimeInfo, String keyword, String etcPostOfficeBox,
			String directoryServer, String isPrivate, String manager, String memo, String user1, String user2,
			String user3, String user4, String companyId, String companyPostOfficeBox, String companyNameKana,
			String companyAnniversary, String companyExpenseInfo, String language, String sansyo, String children,
			String companyPaymentConditions, String office, String postOfficeBox, String hobby, String place,
			String jobName, String firstNameKana, String sex, String birthday, EmailAddress emailAddress1,
			EmailAddress emailAddress2, EmailAddress emailAddress3, String spouse, String secretaryFullName,
			String sensitivity, String category, String lastNameKana, String priority) {
		this.title = title;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.honorific = honorific;
		this.companyName = companyName;
		this.department = department;
		this.jobTitle = jobTitle;
		this.companyAddress = companyAddress;
		this.homeAddress = homeAddress;
		this.etcAddress = etcAddress;
		this.telePhoneNumberList = telePhoneNumberList;
		this.idNumber = idNumber;
		this.webPage = webPage;
		this.account = account;
		this.initial = initial;
		this.internetFreeTimeInfo = internetFreeTimeInfo;
		this.keyword = keyword;
		this.etcPostOfficeBox = etcPostOfficeBox;
		this.directoryServer = directoryServer;
		this.isPrivate = isPrivate;
		this.manager = manager;
		this.memo = memo;
		this.user1 = user1;
		this.user2 = user2;
		this.user3 = user3;
		this.user4 = user4;
		this.companyId = companyId;
		this.companyPostOfficeBox = companyPostOfficeBox;
		this.companyNameKana = companyNameKana;
		this.companyAnniversary = companyAnniversary;
		this.companyExpenseInfo = companyExpenseInfo;
		this.language = language;
		this.sansyo = sansyo;
		this.children = children;
		this.companyPaymentConditions = companyPaymentConditions;
		this.office = office;
		this.postOfficeBox = postOfficeBox;
		this.hobby = hobby;
		this.place = place;
		this.jobName = jobName;
		this.firstNameKana = firstNameKana;
		this.sex = sex;
		this.birthday = birthday;
		this.emailAddress1 = emailAddress1;
		this.emailAddress2 = emailAddress2;
		this.emailAddress3 = emailAddress3;
		this.spouse = spouse;
		this.secretaryFullName = secretaryFullName;
		this.sensitivity = sensitivity;
		this.category = category;
		this.lastNameKana = lastNameKana;
		this.priority = priority;
	}

	/**
	 * @return title 肩書き
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @return firstName 氏名(名)
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @return middleName ミドル ネーム
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * @return lastName 氏名(姓)
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @return honorific 敬称
	 */
	public String getHonorific() {
		return honorific;
	}
	/**
	 * @return companyName 会社名
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * @return department 部署
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @return jobTitle 役職
	 */
	public String getJobTitle() {
		return jobTitle;
	}
	/**
	 * @return companyAddress 住所(会社)
	 */
	public Address getCompanyAddress() {
		return companyAddress;
	}
	/**
	 * @return homeAddress 住所(自宅)
	 */
	public Address getHomeAddress() {
		return homeAddress;
	}
	/**
	 * @return etcAddress 住所(その他)
	 */
	public Address getEtcAddress() {
		return etcAddress;
	}
	/**
	 * @return telePhoneNumberList 電話番号リスト
	 */
	public TelePhoneNumberList getTelePhoneNumberList() {
		return telePhoneNumberList;
	}
	/**
	 * @return idNumber ID 番号
	 */
	public String getIdNumber() {
		return idNumber;
	}
	/**
	 * @return webPage Web ページ
	 */
	public String getWebPage() {
		return webPage;
	}
	/**
	 * @return account アカウント
	 */
	public String getAccount() {
		return account;
	}
	/**
	 * @return initial イニシャル
	 */
	public String getInitial() {
		return initial;
	}
	/**
	 * @return internetFreeTimeInfo インターネット空き時間情報
	 */
	public String getInternetFreeTimeInfo() {
		return internetFreeTimeInfo;
	}
	/**
	 * @return keyword キーワード
	 */
	public String getKeyword() {
		return keyword;
	}
	/**
	 * @return etcPostOfficeBox その他住所私書箱
	 */
	public String getEtcPostOfficeBox() {
		return etcPostOfficeBox;
	}
	/**
	 * @return directoryServer ディレクトリ サーバー
	 */
	public String getDirectoryServer() {
		return directoryServer;
	}
	/**
	 * @return manager マネージャー
	 */
	public String getManager() {
		return manager;
	}
	/**
	 * @return memo メモ
	 */
	public String getMemo() {
		return memo;
	}
	/**
	 * @return user1 ユーザー 1
	 */
	public String getUser1() {
		return user1;
	}
	/**
	 * @return user2 ユーザー 2
	 */
	public String getUser2() {
		return user2;
	}
	/**
	 * @return user3 ユーザー 3
	 */
	public String getUser3() {
		return user3;
	}
	/**
	 * @return user4 ユーザー 4
	 */
	public String getUser4() {
		return user4;
	}
	/**
	 * @return companyId 会社 ID
	 */
	public String getCompanyId() {
		return companyId;
	}
	/**
	 * @return companyPostOfficeBox 会社住所私書箱
	 */
	public String getCompanyPostOfficeBox() {
		return companyPostOfficeBox;
	}
	/**
	 * @return companyNameKana 会社名フリガナ
	 */
	public String getCompanyNameKana() {
		return companyNameKana;
	}
	/**
	 * @return companyAnniversary 記念日
	 */
	public String getCompanyAnniversary() {
		return companyAnniversary;
	}
	/**
	 * @return companyExpenseInfo 経費情報
	 */
	public String getCompanyExpenseInfo() {
		return companyExpenseInfo;
	}
	/**
	 * @return language 言語
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @return sansyo 参照事項
	 */
	public String getSansyo() {
		return sansyo;
	}
	/**
	 * @return children 子供
	 */
	public String getChildren() {
		return children;
	}
	/**
	 * @return companyPaymentConditions 支払い条件
	 */
	public String getCompanyPaymentConditions() {
		return companyPaymentConditions;
	}
	/**
	 * @return office 事業所
	 */
	public String getOffice() {
		return office;
	}
	/**
	 * @return postOfficeBox 自宅住所私書箱
	 */
	public String getPostOfficeBox() {
		return postOfficeBox;
	}
	/**
	 * @return hobby 趣味
	 */
	public String getHobby() {
		return hobby;
	}
	/**
	 * @return place 場所
	 */
	public String getPlace() {
		return place;
	}
	/**
	 * @return jobName 職業
	 */
	public String getJobName() {
		return jobName;
	}
	/**
	 * @return firstNameKana フリガナ(姓)
	 */
	public String getFirstNameKana() {
		return firstNameKana;
	}
	/**
	 * @return sex 性別
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @return birthday 誕生日
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * @return emailAddress1 メール アドレス1
	 */
	public EmailAddress getEmailAddress1() {
		return emailAddress1;
	}
	/**
	 * @return emailAddress2 メール アドレス2
	 */
	public EmailAddress getEmailAddress2() {
		return emailAddress2;
	}
	/**
	 * @return emailAddress3 メール アドレス3
	 */
	public EmailAddress getEmailAddress3() {
		return emailAddress3;
	}
	/**
	 * @return spouse 配偶者
	 */
	public String getSpouse() {
		return spouse;
	}
	/**
	 * @return secretaryFullName 秘書の氏名
	 */
	public String getSecretaryFullName() {
		return secretaryFullName;
	}
	/**
	 * @return sensitivity 秘密度
	 */
	public String getSensitivity() {
		return sensitivity;
	}
	/**
	 * @return category 分類
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @return lastNameKana フリガナ(名)
	 */
	public String getLastNameKana() {
		return lastNameKana;
	}
	/**
	 * @return priority 優先度
	 */
	public String getPriority() {
		return priority;
	}
	
	public static class Builder {
		/** 肩書き */
		private String title = "";
		/** 氏名(名) */
		private String firstName = "";
		/** ミドル ネーム */
		private String middleName = "";
		/** 氏名(姓) */
		private String lastName = "";
		/** 敬称 */
		private String honorific = "";
		/** 会社名 */
		private String companyName = "";
		/** 部署 */
		private String department = "";
		/** 役職 */
		private String jobTitle = "";
		
		/** 住所(会社) */
		private Address companyAddress = new Address.Builder().build();
		/** 住所(自宅) */
		private Address homeAddress = new Address.Builder().build();
		/** 住所(その他) */
		private Address etcAddress = new Address.Builder().build();
		
		/** 電話番号リスト */
		private TelePhoneNumberList telePhoneNumberList = new TelePhoneNumberList.Builder().build();
		
		/** ID 番号 */
		private String idNumber = "";
		/** Web ページ */
		private String webPage = "";
		/** アカウント */
		private String account = "";
		/** イニシャル */
		private String initial = "";
		/** インターネット空き時間情報 */
		private String internetFreeTimeInfo = "";
		/** キーワード */
		private String keyword = "";
		/** その他住所私書箱 */
		private String etcPostOfficeBox = "";
		/** ディレクトリ サーバー */
		private String directoryServer = "";
		/** プライベート (デフォルト値:FALSE)*/
		private String isPrivate = "FALSE";
		/** マネージャー */
		private String manager = "";
		/** メモ */
		private String memo = "";
		/** ユーザー 1 */
		private String user1 = "";
		/** ユーザー 2 */
		private String user2 = "";
		/** ユーザー 3 */
		private String user3 = "";
		/** ユーザー 4 */
		private String user4 = "";
		/** 会社 ID */
		private String companyId = "";
		/** 会社住所私書箱 */
		private String companyPostOfficeBox = "";
		/** 会社名フリガナ */
		private String companyNameKana = "";
		/** 記念日 */
		private String companyAnniversary = "";
		/** 経費情報 */
		private String companyExpenseInfo = "";
		/** 言語 */
		private String language = "";
		/** 参照事項 */
		private String sansyo = "";
		/** 子供 */
		private String children = "";
		/** 支払い条件 */
		private String companyPaymentConditions = "";
		/** 事業所 */
		private String office = "";
		/** 自宅住所私書箱 */
		private String postOfficeBox = "";
		/** 趣味 */
		private String hobby = "";
		/** 場所 */
		private String place = "";
		/** 職業 */
		private String jobName = "";
		/** 姓フリガナ */
		private String firstNameKana = "";
		/** 性別(デフォルト:指定なし) */
		private String sex = "指定なし";
		/** 誕生日(デフォルト値：00/0/0) */
		private String birthday = "00/0/0";
		
		/** 電子メール アドレス1 */
		private EmailAddress emailAddress1 = new EmailAddress.Builder().build();
		/** 電子メール アドレス2 */
		private EmailAddress emailAddress2 = new EmailAddress.Builder().build();
		/** 電子メール アドレス3 */
		private EmailAddress emailAddress3 = new EmailAddress.Builder().build();

		/** 配偶者 */
		private String spouse = "";
		/** 秘書の氏名 */
		private String secretaryFullName = "";
		/** 秘密度(デフォルト値:標準) */
		private String sensitivity = "標準";
		/** 分類 */
		private String category = "";
		/** 名前フリガナ */
		private String lastNameKana = "";
		/** 優先度(デフォルト値:標準) */
		private String priority = "標準";
		
	    public Builder() {
	    }

		/**
		 * @param title 肩書き
		 */
		public Builder setTitle(String title) {
			this.title = title;
			return this;
		}
		/**
		 * @param firstName 氏名(名)
		 */
		public Builder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		/**
		 * @param middleName ミドル ネーム
		 */
		public Builder setMiddleName(String middleName) {
			this.middleName = middleName;
			return this;
		}
		/**
		 * @param lastName 氏名(姓)
		 */
		public Builder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		/**
		 * @param honorific 敬称
		 */
		public Builder setHonorific(String honorific) {
			this.honorific = honorific;
			return this;
		}
		/**
		 * @param companyName 会社名
		 */
		public Builder setCompanyName(String companyName) {
			this.companyName = companyName;
			return this;
		}
		/**
		 * @param department 部署
		 */
		public Builder setDepartment(String department) {
			this.department = department;
			return this;
		}
		/**
		 * @param jobTitle 役職
		 */
		public Builder setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
			return this;
		}
		/**
		 * @param companyAddress 住所(会社)
		 */
		public Builder setCompanyAddress(Address companyAddress) {
			this.companyAddress = companyAddress;
			return this;
		}
		/**
		 * @param homeAddress 住所(自宅)
		 */
		public Builder setHomeAddress(Address homeAddress) {
			this.homeAddress = homeAddress;
			return this;
		}
		/**
		 * @param etcAddress 住所(その他)
		 */
		public Builder setEtcAddress(Address etcAddress) {
			this.etcAddress = etcAddress;
			return this;
		}
		/**
		 * @param telePhoneNumberList 電話番号リスト
		 */
		public Builder setTelePhoneNumberList(TelePhoneNumberList telePhoneNumberList) {
			this.telePhoneNumberList = telePhoneNumberList;
			return this;
		}
		/**
		 * @param idNumber ID 番号
		 */
		public Builder setIdNumber(String idNumber) {
			this.idNumber = idNumber;
			return this;
		}
		/**
		 * @param webPage Web ページ
		 */
		public Builder setWebPage(String webPage) {
			this.webPage = webPage;
			return this;
		}
		/**
		 * @param account アカウント
		 */
		public Builder setAccount(String account) {
			this.account = account;
			return this;
		}
		/**
		 * @param initial イニシャル
		 */
		public Builder setInitial(String initial) {
			this.initial = initial;
			return this;
		}
		/**
		 * @param internetFreeTimeInfo インターネット空き時間情報
		 */
		public Builder setInternetFreeTimeInfo(String internetFreeTimeInfo) {
			this.internetFreeTimeInfo = internetFreeTimeInfo;
			return this;
		}
		/**
		 * @param keyword キーワード
		 */
		public Builder setKeyword(String keyword) {
			this.keyword = keyword;
			return this;
		}
		/**
		 * @param etcPostOfficeBox その他住所私書箱
		 */
		public Builder setEtcPostOfficeBox(String etcPostOfficeBox) {
			this.etcPostOfficeBox = etcPostOfficeBox;
			return this;
		}
		/**
		 * @param directoryServer ディレクトリ サーバー
		 */
		public Builder setDirectoryServer(String directoryServer) {
			this.directoryServer = directoryServer;
			return this;
		}
		/**
		 * @param isPrivate プライベート
		 */
		public Builder setIsPrivate(String isPrivate) {
			this.isPrivate = isPrivate;
			return this;
		}
		/**
		 * @param manager マネージャー
		 */
		public Builder setManager(String manager) {
			this.manager = manager;
			return this;
		}
		/**
		 * @param memo メモ
		 */
		public Builder setMemo(String memo) {
			this.memo = memo;
			return this;
		}
		/**
		 * @param user1 ユーザー 1
		 */
		public Builder setUser1(String user1) {
			this.user1 = user1;
			return this;
		}
		/**
		 * @param user2 ユーザー 2
		 */
		public Builder setUser2(String user2) {
			this.user2 = user2;
			return this;
		}
		/**
		 * @param user3 ユーザー 3
		 */
		public Builder setUser3(String user3) {
			this.user3 = user3;
			return this;
		}
		/**
		 * @param user4 ユーザー 4
		 */
		public Builder setUser4(String user4) {
			this.user4 = user4;
			return this;
		}
		/**
		 * @param companyId 会社 ID
		 */
		public Builder setCompanyId(String companyId) {
			this.companyId = companyId;
			return this;
		}
		/**
		 * @param companyPostOfficeBox 会社住所私書箱
		 */
		public Builder setCompanyPostOfficeBox(String companyPostOfficeBox) {
			this.companyPostOfficeBox = companyPostOfficeBox;
			return this;
		}
		/**
		 * @param companyNameKana 会社名フリガナ
		 */
		public Builder setCompanyNameKana(String companyNameKana) {
			this.companyNameKana = companyNameKana;
			return this;
		}
		/**
		 * @param companyAnniversary 記念日
		 */
		public Builder setCompanyAnniversary(String companyAnniversary) {
			this.companyAnniversary = companyAnniversary;
			return this;
		}
		/**
		 * @param companyExpenseInfo 経費情報
		 */
		public Builder setCompanyExpenseInfo(String companyExpenseInfo) {
			this.companyExpenseInfo = companyExpenseInfo;
			return this;
		}
		/**
		 * @param language 言語
		 */
		public Builder setLanguage(String language) {
			this.language = language;
			return this;
		}
		/**
		 * @param sansyo 参照事項
		 */
		public Builder setSansyo(String sansyo) {
			this.sansyo = sansyo;
			return this;
		}
		/**
		 * @param children 子供
		 */
		public Builder setChildren(String children) {
			this.children = children;
			return this;
		}
		/**
		 * @param companyPaymentConditions 支払い条件
		 */
		public Builder setCompanyPaymentConditions(String companyPaymentConditions) {
			this.companyPaymentConditions = companyPaymentConditions;
			return this;
		}
		/**
		 * @param office 事業所
		 */
		public Builder setOffice(String office) {
			this.office = office;
			return this;
		}
		/**
		 * @param postOfficeBox 自宅住所私書箱
		 */
		public Builder setPostOfficeBox(String postOfficeBox) {
			this.postOfficeBox = postOfficeBox;
			return this;
		}
		/**
		 * @param hobby 趣味
		 */
		public Builder setHobby(String hobby) {
			this.hobby = hobby;
			return this;
		}
		/**
		 * @param place 場所
		 */
		public Builder setPlace(String place) {
			this.place = place;
			return this;
		}
		/**
		 * @param jobName 職業
		 */
		public Builder setJobName(String jobName) {
			this.jobName = jobName;
			return this;
		}
		/**
		 * @param firstNameKana フリガナ(姓)
		 */
		public Builder setFirstNameKana(String firstNameKana) {
			this.firstNameKana = firstNameKana;
			return this;
		}
		/**
		 * @param sex 性別
		 */
		public Builder setSex(String sex) {
			this.sex = sex;
			return this;
		}
		/**
		 * @param birthday 誕生日
		 */
		public Builder setBirthday(String birthday) {
			this.birthday = birthday;
			return this;
		}
		/**
		 * @param emailAddress1 メール アドレス1
		 */
		public Builder setEmailAddress1(EmailAddress emailAddress1) {
			this.emailAddress1 = emailAddress1;
			return this;
		}
		/**
		 * @param emailAddress2 メール アドレス2
		 */
		public Builder setEmailAddress2(EmailAddress emailAddress2) {
			this.emailAddress2 = emailAddress2;
			return this;
		}
		/**
		 * @param emailAddress3 メール アドレス3
		 */
		public Builder setEmailAddress3(EmailAddress emailAddress3) {
			this.emailAddress3 = emailAddress3;
			return this;
		}
		/**
		 * @param spouse 配偶者
		 */
		public Builder setSpouse(String spouse) {
			this.spouse = spouse;
			return this;
		}
		/**
		 * @param secretaryFullName 秘書の氏名
		 */
		public Builder setSecretaryFullName(String secretaryFullName) {
			this.secretaryFullName = secretaryFullName;
			return this;
		}
		/**
		 * @param sensitivity 秘密度
		 */
		public Builder setSensitivity(String sensitivity) {
			this.sensitivity = sensitivity;
			return this;
		}
		/**
		 * @param category 分類
		 */
		public Builder setCategory(String category) {
			this.category = category;
			return this;
		}
		/**
		 * @param lastNameKana フリガナ(名)
		 */
		public Builder setLastNameKana(String lastNameKana) {
			this.lastNameKana = lastNameKana;
			return this;
		}
		/**
		 * @param priority 優先度
		 */
		public Builder setPriority(String priority) {
			this.priority = priority;
			return this;
		}

	    public OutlookAddressBook build() {
	    	return new OutlookAddressBook(
	    			title,
	    			firstName,
	    			middleName,
	    			lastName,
	    			honorific,
	    			companyName,
	    			department,
	    			jobTitle,
	    			companyAddress,
	    			homeAddress,
	    			etcAddress,
	    			telePhoneNumberList,
	    			idNumber,
	    			webPage,
	    			account,
	    			initial,
	    			internetFreeTimeInfo,
	    			keyword,
	    			etcPostOfficeBox,
	    			directoryServer,
	    			isPrivate,
	    			manager,
	    			memo,
	    			user1,
	    			user2,
	    			user3,
	    			user4,
	    			companyId,
	    			companyPostOfficeBox,
	    			companyNameKana,
	    			companyAnniversary,
	    			companyExpenseInfo,
	    			language,
	    			sansyo,
	    			children,
	    			companyPaymentConditions,
	    			office,
	    			postOfficeBox,
	    			hobby,
	    			place,
	    			jobName,
	    			firstNameKana,
	    			sex,
	    			birthday,
	    			emailAddress1,
	    			emailAddress2,
	    			emailAddress3,
	    			spouse,
	    			secretaryFullName,
	    			sensitivity,
	    			category,
	    			lastNameKana,
	    			priority
	    	);
	    }
	}

	@Override
	public String toString() {
		return "OutlookAddressBook [title=" + title + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", honorific=" + honorific + ", companyName=" + companyName
				+ ", department=" + department + ", jobTitle=" + jobTitle + ", companyAddress=" + companyAddress
				+ ", homeAddress=" + homeAddress + ", etcAddress=" + etcAddress + ", telePhoneNumberList="
				+ telePhoneNumberList + ", idNumber=" + idNumber + ", webPage=" + webPage + ", account=" + account
				+ ", initial=" + initial + ", internetFreeTimeInfo=" + internetFreeTimeInfo + ", keyword=" + keyword
				+ ", etcPostOfficeBox=" + etcPostOfficeBox + ", directoryServer=" + directoryServer + ", isPrivate="
				+ isPrivate + ", manager=" + manager + ", memo=" + memo + ", user1=" + user1 + ", user2=" + user2
				+ ", user3=" + user3 + ", user4=" + user4 + ", companyId=" + companyId + ", companyPostOfficeBox="
				+ companyPostOfficeBox + ", companyNameKana=" + companyNameKana + ", companyAnniversary="
				+ companyAnniversary + ", companyExpenseInfo=" + companyExpenseInfo + ", language=" + language
				+ ", sansyo=" + sansyo + ", children=" + children + ", companyPaymentConditions="
				+ companyPaymentConditions + ", office=" + office + ", postOfficeBox=" + postOfficeBox + ", hobby="
				+ hobby + ", place=" + place + ", jobName=" + jobName + ", firstNameKana=" + firstNameKana + ", sex="
				+ sex + ", birthday=" + birthday + ", emailAddress1=" + emailAddress1 + ", emailAddress2="
				+ emailAddress2 + ", emailAddress3=" + emailAddress3 + ", spouse=" + spouse + ", secretaryFullName="
				+ secretaryFullName + ", sensitivity=" + sensitivity + ", category=" + category + ", lastNameKana="
				+ lastNameKana + ", priority=" + priority + "]";
	}
}
