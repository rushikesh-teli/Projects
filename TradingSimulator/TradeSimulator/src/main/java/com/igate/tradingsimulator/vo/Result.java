package com.igate.tradingsimulator.vo;

import java.io.Serializable;
import static com.igate.tradingsimulator.util.AppConstants.EMPTY_STRING; 

public class Result implements Serializable{

	private static final long serialVersionUID = -69265866837822474L;
	
	private String status;
	private String message;
	
	public Result(){
		this.status = EMPTY_STRING;
		this.message = EMPTY_STRING;
	}
	
	public Result(String status, String message){
		this.status = status;
		this.message = message;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
