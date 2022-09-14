package com.aakash.ticket;

public class Languages {
	int id;
	String languageCode;
	String languageName;
	String country;
	
	public Languages(int id, String languageCode, String languageName, String country) {
		this.id = id;
		this.languageCode = languageCode;
		this.languageName = languageName;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Languages [id=" + id + ", languageCode=" + languageCode + ", languageName=" + languageName + ", country="
				+ country + "]";
	}
	
}
