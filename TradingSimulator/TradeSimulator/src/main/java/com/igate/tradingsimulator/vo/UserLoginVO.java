package com.igate.tradingsimulator.vo;

import java.io.Serializable;

public class UserLoginVO implements Serializable{
	private static final long serialVersionUID = -3152470037193036375L;
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
