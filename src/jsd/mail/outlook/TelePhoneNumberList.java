package jsd.mail.outlook;

import jsd.csv.annotation.CSVColumn;

/**
 * <b>以下の電話番号を格納します.</b>
 * 
 * <pre>
 * 秘書の電話 secretaryTelePhoneNumber
 * 会社 FAX companyFaxNumber
 * 会社電話 companyTelePhoneNumber
 * 会社電話 2 companyTelePhoneNumber2
 * コールバック callBackNumber
 * 自動車電話 carTelePhoneNumber
 * 会社代表電話 presidentTelePhoneNumber
 * 自宅 FAX faxNumber
 * 自宅電話 telePhoneNumber
 * 自宅電話 2 telePhoneNumber2
 * ISDN isdnNumber
 * 携帯電話 cellPhoneNumber
 * その他の FAX etcFaxNumber
 * その他の電話 etcTelePhoneNumber
 * ポケットベル pagerNumber
 * 通常の電話 standardTelePhoneNumber
 * 無線電話 wirelessTelephoneNumber
 * TTY/TDD ttyttdNumber
 * テレックス telexNumber
 * </pre>
 */
public class TelePhoneNumberList {
	/** 秘書の電話 */
	@CSVColumn(index = 0)
	private final String secretaryTelePhoneNumber;
	/** 会社 FAX */
	@CSVColumn(index = 1)
	private final String companyFaxNumber;
	/** 会社電話 */
	@CSVColumn(index = 2)
	private final String companyTelePhoneNumber;
	/** 会社電話 2 */
	@CSVColumn(index = 3)
	private final String companyTelePhoneNumber2;
	/** コールバック */
	@CSVColumn(index = 4)
	private final String callBackNumber;
	/** 自動車電話 */
	@CSVColumn(index = 5)
	private final String carTelePhoneNumber;
	/** 会社代表電話 */
	@CSVColumn(index = 6)
	private final String presidentTelePhoneNumber;
	/** 自宅 FAX */
	@CSVColumn(index = 7)
	private final String faxNumber;
	/** 自宅電話 */
	@CSVColumn(index = 8)
	private final String telePhoneNumber;
	/** 自宅電話 2 */
	@CSVColumn(index = 9)
	private final String telePhoneNumber2;
	/** ISDN */
	@CSVColumn(index = 10)
	private final String isdnNumber;
	/** 携帯電話 */
	@CSVColumn(index = 11)
	private final String cellPhoneNumber;
	/** その他の FAX */
	@CSVColumn(index = 12)
	private final String etcFaxNumber;
	/** その他の電話 */
	@CSVColumn(index = 13)
	private final String etcTelePhoneNumber;
	/** ポケットベル */
	@CSVColumn(index = 14)
	private final String pagerNumber;
	/** 通常の電話 */
	@CSVColumn(index = 15)
	private final String standardTelePhoneNumber;
	/** 無線電話 */
	@CSVColumn(index = 16)
	private final String wirelessTelephoneNumber;
	/** TTY/TDD */
	@CSVColumn(index = 17)
	private final String ttyttdNumber;
	/** テレックス */
	@CSVColumn(index = 18)
	private final String telexNumber;
	
	private TelePhoneNumberList(String secretaryTelePhoneNumber, String companyFaxNumber, String companyTelePhoneNumber,
			String companyTelePhoneNumber2, String callBackNumber, String carTelePhoneNumber,
			String presidentTelePhoneNumber, String faxNumber, String telePhoneNumber, String telePhoneNumber2,
			String isdnNumber, String cellPhoneNumber, String etcFaxNumber, String etcTelePhoneNumber,
			String pagerNumber, String standardTelePhoneNumber, String wirelessTelephoneNumber, String ttyttdNumber,
			String telexNumber) {
		this.secretaryTelePhoneNumber = secretaryTelePhoneNumber;
		this.companyFaxNumber = companyFaxNumber;
		this.companyTelePhoneNumber = companyTelePhoneNumber;
		this.companyTelePhoneNumber2 = companyTelePhoneNumber2;
		this.callBackNumber = callBackNumber;
		this.carTelePhoneNumber = carTelePhoneNumber;
		this.presidentTelePhoneNumber = presidentTelePhoneNumber;
		this.faxNumber = faxNumber;
		this.telePhoneNumber = telePhoneNumber;
		this.telePhoneNumber2 = telePhoneNumber2;
		this.isdnNumber = isdnNumber;
		this.cellPhoneNumber = cellPhoneNumber;
		this.etcFaxNumber = etcFaxNumber;
		this.etcTelePhoneNumber = etcTelePhoneNumber;
		this.pagerNumber = pagerNumber;
		this.standardTelePhoneNumber = standardTelePhoneNumber;
		this.wirelessTelephoneNumber = wirelessTelephoneNumber;
		this.ttyttdNumber = ttyttdNumber;
		this.telexNumber = telexNumber;
	}
	
	/**
	 * @return secretaryTelePhoneNumber 秘書の電話
	 */
	public String getSecretaryTelePhoneNumber() {
		return secretaryTelePhoneNumber;
	}
	/**
	 * @return companyFaxNumber 会社 FAX
	 */
	public String getCompanyFaxNumber() {
		return companyFaxNumber;
	}
	/**
	 * @return companyTelePhoneNumber 会社電話
	 */
	public String getCompanyTelePhoneNumber() {
		return companyTelePhoneNumber;
	}
	/**
	 * @return companyTelePhoneNumber2 会社電話 2
	 */
	public String getCompanyTelePhoneNumber2() {
		return companyTelePhoneNumber2;
	}
	/**
	 * @return callBackNumber コールバック
	 */
	public String getCallBackNumber() {
		return callBackNumber;
	}
	/**
	 * @return carTelePhoneNumber 自動車電話
	 */
	public String getCarTelePhoneNumber() {
		return carTelePhoneNumber;
	}
	/**
	 * @return presidentTelePhoneNumber 会社代表電話
	 */
	public String getPresidentTelePhoneNumber() {
		return presidentTelePhoneNumber;
	}
	/**
	 * @return faxNumber 自宅 FAX
	 */
	public String getFaxNumber() {
		return faxNumber;
	}
	/**
	 * @return telePhoneNumber 自宅電話
	 */
	public String getTelePhoneNumber() {
		return telePhoneNumber;
	}
	/**
	 * @return telePhoneNumber2 自宅電話 2
	 */
	public String getTelePhoneNumber2() {
		return telePhoneNumber2;
	}
	/**
	 * @return isdnNumber ISDN
	 */
	public String getIsdnNumber() {
		return isdnNumber;
	}
	/**
	 * @return cellPhoneNumber 携帯電話
	 */
	public String getCellPhoneNumber() {
		return cellPhoneNumber;
	}
	/**
	 * @return etcFaxNumber その他の FAX
	 */
	public String getEtcFaxNumber() {
		return etcFaxNumber;
	}
	/**
	 * @return etcTelePhoneNumber その他の電話
	 */
	public String getEtcTelePhoneNumber() {
		return etcTelePhoneNumber;
	}
	/**
	 * @return pagerNumber ポケットベル
	 */
	public String getPagerNumber() {
		return pagerNumber;
	}
	/**
	 * @return standardTelePhoneNumber 通常の電話
	 */
	public String getStandardTelePhoneNumber() {
		return standardTelePhoneNumber;
	}
	/**
	 * @return wirelessTelephoneNumber 無線電話
	 */
	public String getWirelessTelephoneNumber() {
		return wirelessTelephoneNumber;
	}
	/**
	 * @return ttyttdNumber TTY/TDD
	 */
	public String getTtyttdNumber() {
		return ttyttdNumber;
	}
	/**
	 * @return telexNumber テレックス
	 */
	public String getTelexNumber() {
		return telexNumber;
	}
	
	@Override
	public String toString() {
		return "TelePhoneNumberList [secretaryTelePhoneNumber=" + secretaryTelePhoneNumber + ", companyFaxNumber="
				+ companyFaxNumber + ", companyTelePhoneNumber=" + companyTelePhoneNumber + ", companyTelePhoneNumber2="
				+ companyTelePhoneNumber2 + ", callBackNumber=" + callBackNumber + ", carTelePhoneNumber="
				+ carTelePhoneNumber + ", presidentTelePhoneNumber=" + presidentTelePhoneNumber + ", faxNumber="
				+ faxNumber + ", telePhoneNumber=" + telePhoneNumber + ", telePhoneNumber2=" + telePhoneNumber2
				+ ", isdnNumber=" + isdnNumber + ", cellPhoneNumber=" + cellPhoneNumber + ", etcFaxNumber="
				+ etcFaxNumber + ", etcTelePhoneNumber=" + etcTelePhoneNumber + ", pagerNumber=" + pagerNumber
				+ ", standardTelePhoneNumber=" + standardTelePhoneNumber + ", wirelessTelephoneNumber="
				+ wirelessTelephoneNumber + ", ttyttdNumber=" + ttyttdNumber + ", telexNumber=" + telexNumber + "]";
	}
	
	public static class Builder {
		/** 秘書の電話 */
		private String secretaryTelePhoneNumber = "";
		/** 会社 FAX */
		private String companyFaxNumber = "";
		/** 会社電話 */
		private String companyTelePhoneNumber = "";
		/** 会社電話 2 */
		private String companyTelePhoneNumber2 = "";
		/** コールバック */
		private String callBackNumber = "";
		/** 自動車電話 */
		private String carTelePhoneNumber = "";
		/** 会社代表電話 */
		private String presidentTelePhoneNumber = "";
		/** 自宅 FAX */
		private String faxNumber = "";
		/** 自宅電話 */
		private String telePhoneNumber = "";
		/** 自宅電話 2 */
		private String telePhoneNumber2 = "";
		/** ISDN */
		private String isdnNumber = "";
		/** 携帯電話 */
		private String cellPhoneNumber = "";
		/** その他の FAX */
		private String etcFaxNumber = "";
		/** その他の電話 */
		private String etcTelePhoneNumber = "";
		/** ポケットベル */
		private String pagerNumber = "";
		/** 通常の電話 */
		private String standardTelePhoneNumber = "";
		/** 無線電話 */
		private String wirelessTelephoneNumber = "";
		/** TTY/TDD */
		private String ttyttdNumber = "";
		/** テレックス */
		private String telexNumber = "";
		
		public Builder() {
		}
		
		/**
		 * @param secretaryTelePhoneNumber 秘書の電話
		 */
		public Builder setSecretaryTelePhoneNumber(String secretaryTelePhoneNumber) {
			this.secretaryTelePhoneNumber = secretaryTelePhoneNumber;
			return this;
		}
		/**
		 * @param companyFaxNumber 会社 FAX
		 */
		public Builder setCompanyFaxNumber(String companyFaxNumber) {
			this.companyFaxNumber = companyFaxNumber;
			return this;
		}
		/**
		 * @param companyTelePhoneNumber セットする companyTelePhoneNumber 会社電話
		 */
		public Builder setCompanyTelePhoneNumber(String companyTelePhoneNumber) {
			this.companyTelePhoneNumber = companyTelePhoneNumber;
			return this;
		}
		/**
		 * @param companyTelePhoneNumber2 会社電話 2
		 */
		public Builder setCompanyTelePhoneNumber2(String companyTelePhoneNumber2) {
			this.companyTelePhoneNumber2 = companyTelePhoneNumber2;
			return this;
		}
		/**
		 * @param callBackNumber コールバック
		 */
		public Builder setCallBackNumber(String callBackNumber) {
			this.callBackNumber = callBackNumber;
			return this;
		}
		/**
		 * @param carTelePhoneNumber 自動車電話
		 */
		public Builder setCarTelePhoneNumber(String carTelePhoneNumber) {
			this.carTelePhoneNumber = carTelePhoneNumber;
			return this;
		}
		/**
		 * @param presidentTelePhoneNumber 会社代表電話
		 */
		public Builder setPresidentTelePhoneNumber(String presidentTelePhoneNumber) {
			this.presidentTelePhoneNumber = presidentTelePhoneNumber;
			return this;
		}
		/**
		 * @param faxNumber 自宅 FAX
		 */
		public Builder setFaxNumber(String faxNumber) {
			this.faxNumber = faxNumber;
			return this;
		}
		/**
		 * @param telePhoneNumber 自宅電話
		 */
		public Builder setTelePhoneNumber(String telePhoneNumber) {
			this.telePhoneNumber = telePhoneNumber;
			return this;
		}
		/**
		 * @param telePhoneNumber2 自宅電話 2
		 */
		public Builder setTelePhoneNumber2(String telePhoneNumber2) {
			this.telePhoneNumber2 = telePhoneNumber2;
			return this;
		}
		/**
		 * @param isdnNumber ISDN
		 */
		public Builder setIsdnNumber(String isdnNumber) {
			this.isdnNumber = isdnNumber;
			return this;
		}
		/**
		 * @param cellPhoneNumber 携帯電話
		 */
		public Builder setCellPhoneNumber(String cellPhoneNumber) {
			this.cellPhoneNumber = cellPhoneNumber;
			return this;
		}
		/**
		 * @param etcFaxNumber その他の FAX
		 */
		public Builder setEtcFaxNumber(String etcFaxNumber) {
			this.etcFaxNumber = etcFaxNumber;
			return this;
		}
		/**
		 * @param etcTelePhoneNumber その他の電話
		 */
		public Builder setEtcTelePhoneNumber(String etcTelePhoneNumber) {
			this.etcTelePhoneNumber = etcTelePhoneNumber;
			return this;
		}
		/**
		 * @param pagerNumber ポケットベル
		 */
		public Builder setPagerNumber(String pagerNumber) {
			this.pagerNumber = pagerNumber;
			return this;
		}
		/**
		 * @param standardTelePhoneNumber 通常の電話
		 */
		public Builder setStandardTelePhoneNumber(String standardTelePhoneNumber) {
			this.standardTelePhoneNumber = standardTelePhoneNumber;
			return this;
		}
		/**
		 * @param wirelessTelephoneNumber 無線電話
		 */
		public Builder setWirelessTelephoneNumber(String wirelessTelephoneNumber) {
			this.wirelessTelephoneNumber = wirelessTelephoneNumber;
			return this;
		}
		/**
		 * @param ttyttdNumber TTY/TDD
		 */
		public Builder setTtyttdNumber(String ttyttdNumber) {
			this.ttyttdNumber = ttyttdNumber;
			return this;
		}
		/**
		 * @param telexNumber テレックス
		 */
		public Builder setTelexNumber(String telexNumber) {
			this.telexNumber = telexNumber;
			return this;
		}
		
		public TelePhoneNumberList build() {
			return new TelePhoneNumberList(
					secretaryTelePhoneNumber,
					companyFaxNumber,
					companyTelePhoneNumber,
					companyTelePhoneNumber2,
					callBackNumber,
					carTelePhoneNumber,
					presidentTelePhoneNumber,
					faxNumber,
					telePhoneNumber,
					telePhoneNumber2,
					isdnNumber,
					cellPhoneNumber,
					etcFaxNumber,
					etcTelePhoneNumber,
					pagerNumber,
					standardTelePhoneNumber,
					wirelessTelephoneNumber,
					ttyttdNumber,
					telexNumber
			);
		}
	}
}
