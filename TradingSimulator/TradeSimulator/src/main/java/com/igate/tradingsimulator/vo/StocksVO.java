package com.igate.tradingsimulator.vo;

import java.io.Serializable;

public class StocksVO implements Serializable{

	private static final long serialVersionUID = -7169044198372183130L;
	


	private String name;
	private String abbreviation;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAbbreviation() {
		return abbreviation;
	}


	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}