package com.igate.tradingsimulator.domain;

import java.io.Serializable;

public class Stocks implements Serializable{

	private static final long serialVersionUID = -63438235637097731L;
	
	private String stockId;
	private String stockDesc;
	private float marketValue;
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public String getStockDesc() {
		return stockDesc;
	}
	public void setStockDesc(String stockDesc) {
		this.stockDesc = stockDesc;
	}
	public float getMarketValue() {
		return marketValue;
	}
	public void setMarketValue(float marketValue) {
		this.marketValue = marketValue;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
