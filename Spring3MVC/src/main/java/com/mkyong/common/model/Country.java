package com.mkyong.common.model;

import java.io.Serializable;

public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	private String countryId;

	private String countryName;

	public Country() {
	}

	public String getCountryId() {
		return this.countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}