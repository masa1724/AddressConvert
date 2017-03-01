package jsd.mail.outlook;

import jsd.csv.annotation.CSVColumn;

/**
 * <b>以下のEmailアドレス情報を格納します.</b>
 *
 * <pre>
 * ・電子メール アドレス email
 * ・電子メールの種類 type
 * ・電子メール表示名 viewName
 * </pre>
 */
public class EmailAddress {
	public static final String DEFAULT_EMAIL_TYPE = "SMTP";
	
	/** 電子メール アドレス */
	@CSVColumn(index = 0)
	private final String email;
	/** 電子メールの種類 */
	@CSVColumn(index = 1)
	private final String type;
	/** 電子メール表示名 */
	@CSVColumn(index = 2)
	private final String viewName;
	
	private EmailAddress(String email, 
						 String type, 
						 String viewName) {
		this.email = email;
		this.type = type;
		this.viewName = viewName;
	}

	/**
	 * @return email 電子メール アドレス
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @return type 電子メールの種類
	 */
	public String getType() {
		return type;
	}
	/**
	 * @return viewName 電子メール表示名
	 */
	public String getViewName() {
		return viewName;
	}

	@Override
	public String toString() {
		return "EmailAddress [email=" + email + ", type=" + type + ", viewName=" + viewName + "]";
	}
	
	public static class Builder {
		/** 電子メール アドレス */
		private String email = "";
		/** 電子メールの種類(デフォルト値:SMTP) */
		private String type = "";
		/** 電子メール表示名 */
		private String viewName = "";
		
	    public Builder() {
	    }
	    
		/**
		 * @param email 電子メール アドレス
		 */
		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}
		/**
		 * @param type 電子メールの種類
		 */
		public Builder setType(String type) {
			this.type = type;
			return this;
		}
		/**
		 * @param name 氏名(姓名)
		 * @param email 電子メール アドレス
		 */
		public Builder setViewName(String name, String email) {
			this.viewName = name + " (" + email + ")";
			return this;
		}
		
		public EmailAddress build() {
			return new EmailAddress(
					email,
					type,
					viewName
			);
		}
	}
}
