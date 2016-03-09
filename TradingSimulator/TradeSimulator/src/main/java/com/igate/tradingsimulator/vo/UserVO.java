package com.igate.tradingsimulator.vo;

import java.io.Serializable;

public class UserVO extends UserLoginVO implements Serializable{

	private static final long serialVersionUID = 4102106874354440776L;
	
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
