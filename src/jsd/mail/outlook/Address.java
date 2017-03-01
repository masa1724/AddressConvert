package jsd.mail.outlook;

import jsd.csv.annotation.CSVColumn;

/**
 * <b>以下の住所情報を格納します.</b>
 * 
 * <pre>
 * ・番地 address
 * ・住所 2 address2
 * ・住所 3 address3
 * ・市町村 city
 * ・都道府県 state
 * ・郵便番号 zipCode
 * ・国 /地域 country
 * </pre>
 */
public class Address {
	/** 番地 */
	@CSVColumn(index = 0)
	private final String address;
	/** 住所 2 */
	@CSVColumn(index = 1)
	private final String address2;
	/** 住所 3 */
	@CSVColumn(index = 2)
	private final String address3;
	/** 市町村 */
	@CSVColumn(index = 3)
	private final String city;
	/** 都道府県 */
	@CSVColumn(index = 4)
	private final String state;
	/** 郵便番号 */
	@CSVColumn(index = 5)
	private final String zipCode;
	/** 国 /地域 */
	@CSVColumn(index = 6)
	private final String country;
	
	private Address(String address, 
					String address2, 
					String address3, 
					String city, 
					String state, 
					String zipCode,
					String country) {
		this.address = address;
		this.address2 = address2;
		this.address3 = address3;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
	}
	
	/**
	 * @return address 番地
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @return address2 住所 2
	 */
	public String getAddress2() {
		return address2;
	}
	/**
	 * @return address3 住所 3
	 */
	public String getAddress3() {
		return address3;
	}
	/**
	 * @return city 市町村
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @return state 都道府県
	 */
	public String getState() {
		return state;
	}
	/**
	 * @return zipCode 郵便番号
	 */
	public String getZipCode() {
		return zipCode;
	}
	/**
	 * @return country 国 /地域
	 */
	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + ", address2=" + address2 + ", address3=" + address3 + ", city=" + city
				+ ", state=" + state + ", zipCode=" + zipCode + ", country=" + country + "]";
	}
	
	public static class Builder {
		/** 番地 */
		private String address = "";
		/** 住所 2 */
		private String address2 = "";
		/** 住所 3 */
		private String address3 = "";
		/** 市町村 */
		private String city = "";
		/** 都道府県 */
		private String state = "";
		/** 郵便番号 */
		private String zipCode = "";
		/** 国 /地域 */
		private String country = "";
		
	    public Builder() {
	    }
		
		/**
		 * @param address 番地
		 */
		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}
		/**
		 * @param address2 住所 2
		 */
		public Builder setAddress2(String address2) {
			this.address2 = address2;
			return this;
		}
		/**
		 * @param address3 住所 3
		 */
		public Builder setAddress3(String address3) {
			this.address3 = address3;
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
		 * @param state 都道府県
		 */
		public Builder setState(String state) {
			this.state = state;
			return this;
		}
		/**
		 * @param zipCode セットする zipCode 郵便番号
		 */
		public Builder setZipCode(String zipCode) {
			this.zipCode = zipCode;
			return this;
		}
		/**
		 * @param country 国 /地域
		 */
		public Builder setCountry(String country) {
			this.country = country;
			return this;
		}

		public Address build() {
			return new Address(
				address,
				address2,
				address3,
				city,
				state,
				zipCode,
				country
			);
		}
	}
}
