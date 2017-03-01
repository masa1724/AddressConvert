package jsd.mail.alphamail;

/**
 * <b>以下のアルファメールのアドレス情報を格納します.</b>
 *
 * <pre>
 * ふりがな hurigana
 * 名前 name
 * メールアドレス email
 * 組織 organization
 * 部署 department
 * 役職 jobTiTle
 * 電話1 tel1
 * 電話2 tel2
 * 電話3 tel3
 * FAX fax
 * 国 country
 * 郵便番号 zipCode
 * 都道府県 state
 * 市町村 city
 * 番地 address
 * URL url
 * メモ memo
 * ? addrpath
 * ? extField1
 * ? extField2
 * ? extField3
 * </pre>
 */
public class AlphaMailAddressBook {
	/** ふりがな */
	private final String hurigana;
	/** 名前 */
	private final String name;
	/** メールアドレス */
	private final String email;
	/** 組織 */
	private final String organization;
	/** 部署 */
	private final String department;
	/** 役職 */
	private final String jobTiTle;
	/** 電話1 */
	private final String tel1;
	/** 電話2 */
	private final String tel2;
	/** 電話3 */
	private final String tel3;
	/** FAX */
	private final String fax;
	/** 国 */
	private final String country;
	/** 郵便番号 */
	private final String zipCode;
	/** 都道府県 */
	private final String state;
	/** 市町村 */
	private final String city;
	/** 番地 */
	private final String address;
	/** URL */
	private final String url;
	/** メモ */
	private final String memo;
	/** ? */
	private final String addrpath;
	/** ? */
	private final String extField1;
	/** ? */
	private final String extField2;
	/** ? */
	private final String extField3;
	
	private AlphaMailAddressBook(
					String hurigana, 
					String name, 
					String email, 
					String organization, 
					String department,
					String jobTiTle, 
					String tel1, 
					String tel2, 
					String tel3, 
					String fax, 
					String country, 
					String zipCode,
					String state, 
					String city, 
					String address, 
					String url, 
					String memo, 
					String addrpath, 
					String extField1,
					String extField2, 
					String extField3) {
		this.hurigana = hurigana;
		this.name = name;
		this.email = email;
		this.organization = organization;
		this.department = department;
		this.jobTiTle = jobTiTle;
		this.tel1 = tel1;
		this.tel2 = tel2;
		this.tel3 = tel3;
		this.fax = fax;
		this.country = country;
		this.zipCode = zipCode;
		this.state = state;
		this.city = city;
		this.address = address;
		this.url = url;
		this.memo = memo;
		this.addrpath = addrpath;
		this.extField1 = extField1;
		this.extField2 = extField2;
		this.extField3 = extField3;
	}
	
	/**
	 * @return hurigana ふりがな
	 */
	public String getHurigana() {
		return hurigana;
	}
	/**
	 * @return name 名前
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return email メールアドレス
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @return organization 組織
	 */
	public String getOrganization() {
		return organization;
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
		return jobTiTle;
	}
	/**
	 * @return tel1　電話1
	 */
	public String getTel1() {
		return tel1;
	}
	/**
	 * @return tel2　電話2
	 */
	public String getTel2() {
		return tel2;
	}
	/**
	 * @return tel3 電話3
	 */
	public String getTel3() {
		return tel3;
	}
	/**
	 * @return fax FAX
	 */
	public String getFax() {
		return fax;
	}
	/**
	 * @return country 国
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @return zipCode 郵便番号
	 */
	public String getZipCode() {
		return zipCode;
	}
	/**
	 * @return state 都道府県
	 */
	public String getState() {
		return state;
	}
	/**
	 * @return city 市町村
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @return addres 番地
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @return url URL
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @return memo メモ
	 */
	public String getMemo() {
		return memo;
	}
	/**
	 * @return addrpath ?
	 */
	public String getAddrpath() {
		return addrpath;
	}
	/**
	 * @return extField1 ?
	 */
	public String getExtField1() {
		return extField1;
	}
	/**
	 * @return extField2 ?
	 */
	public String getExtField2() {
		return extField2;
	}
	/**
	 * @return extField3 ?
	 */
	public String getExtField3() {
		return extField3;
	}
	
	@Override
	public String toString() {
		return "AlphaMailAddress [hurigana=" + hurigana + ", name=" + name + ", email=" + email + ", organization="
				+ organization + ", department=" + department + ", jobTiTle=" + jobTiTle + ", tel1=" + tel1 + ", tel2=" + tel2
				+ ", tel3=" + tel3 + ", fax=" + fax + ", country=" + country + ", zipCode=" + zipCode + ", state="
				+ state + ", city=" + city + ", address=" + address + ", url=" + url + ", memo=" + memo + ", addrpath="
				+ addrpath + ", extField1=" + extField1 + ", extField2=" + extField2 + ", extField3=" + extField3 + "]";
	}
	
    public static class Builder {
    	/** ふりがな */
    	private String hurigana = "";
    	/** 名前 */
    	private String name = "";
    	/** メールアドレス */
    	private String email = "";
    	/** 組織 */
    	private String organization = "";
    	/** 部署 */
    	private String department = "";
    	/** 役職 */
    	private String jobTiTle = "";
    	/** 電話1 */
    	private String tel1 = "";
    	/** 電話2 */
    	private String tel2 = "";
    	/** 電話3 */
    	private String tel3 = "";
    	/** FAX */
    	private String fax = "";
    	/** 国 */
    	private String country = "";
    	/** 郵便番号 */
    	private String zipCode = "";
    	/** 都道府県 */
    	private String state = "";
    	/** 市町村 */
    	private String city = "";
    	/** 番地 */
    	private String address = "";
    	/** URL */
    	private String url = "";
    	/** メモ */
    	private String memo = "";
    	/** ? */
    	private String addrpath = "";
    	/** ? */
    	private String extField1 = "";
    	/** ? */
    	private String extField2 = "";
    	/** ? */
    	private String extField3 = "";
    	
	    public Builder() {
	    }
	    
		/**
		 * @param hurigana ふりがな
		 */
		public Builder setHurigana(String hurigana) {
			this.hurigana = hurigana;
			return this;
		}
		/**
		 * @param name 名前
		 */
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		/**
		 * @param email メールアドレス
		 */
		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}
		/**
		 * @param organization 組織
		 */
		public Builder setOrganization(String organization) {
			this.organization = organization;
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
		 * @param title 役職
		 */
		public Builder setJobTitle(String jobTitle) {
			this.jobTiTle = jobTitle;
			return this;
		}
		/**
		 * @param tel1 電話1
		 */
		public Builder setTel1(String tel1) {
			this.tel1 = tel1;
			return this;
		}
		
		/**
		 * @param tel2 電話2
		 */
		public Builder setTel2(String tel2) {
			this.tel2 = tel2;
			return this;
		}
		/**
		 * @param tel3 電話3
		 */
		public Builder setTel3(String tel3) {
			this.tel3 = tel3;
			return this;
		}
		/**
		 * @param fax FAX
		 */
		public Builder setFax(String fax) {
			this.fax = fax;
			return this;
		}
		/**
		 * @param country 国
		 */
		public Builder setCountry(String country) {
			this.country = country;
			return this;
		}
		/**
		 * @param zipCode 郵便番号
		 */
		public Builder setZipCode(String zipCode) {
			this.zipCode = zipCode;
			return this;
		}
		/**
		 * @param state 都道府県
		 */
		public Builder setState(String state) {
			this.state = state;
			return this;
		}
		/**
		 * @param city 市町村
		 */
		public Builder setCity(String city) {
			this.city = city;
			return this;
		}
		/**
		 * @param address 番地
		 */
		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}
		/**
		 * @param url URL
		 */
		public Builder setUrl(String url) {
			this.url = url;
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
		 * @param addrpath ?
		 */
		public Builder setAddrpath(String addrpath) {
			this.addrpath = addrpath;
			return this;
		}
		/**
		 * @param extField1 ?
		 */
		public Builder setExtField1(String extField1) {
			this.extField1 = extField1;
			return this;
		}
		/**
		 * @param extField2 ?
		 */
		public Builder setExtField2(String extField2) {
			this.extField2 = extField2;
			return this;
		}
		/**
		 * @param extField3 ?
		 */
		public Builder setExtField3(String extField3) {
			this.extField3 = extField3;
			return this;
		}
		
		public AlphaMailAddressBook build() {
			return new AlphaMailAddressBook(
				hurigana,
				name,
				email,
				organization,
				department,
				jobTiTle,
				tel1,
				tel2,
				tel3,
				fax,
				country,
				zipCode,
				state,
				city,
				address,
				url,
				memo,
				addrpath,
				extField1,
				extField2,
				extField3
			);
		}
    }
}
