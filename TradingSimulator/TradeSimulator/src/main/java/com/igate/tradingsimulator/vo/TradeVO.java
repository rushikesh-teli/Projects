package com.igate.tradingsimulator.vo;

import java.io.Serializable;
import java.util.Date;

public class TradeVO extends Result implements Serializable{

	private static final long serialVersionUID = -247542625635244052L;
	
	private int id;
	private Date transactionDate;
	private float price;
	private float tradeValue;
	private float brokerage;
	private float taxes;
	private int contractNote;
	private Date orderDate;
	private int count;
	
	private String username;
	private String action;
	private String stock;
	private String product;
	private String exchange;
	private int quantity;
	private String orderType;
	private float limitPrice;
	private float viewLimit;
	private String orderValidity;
	private float stopLossTriggerPrice;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public float getTradeValue() {
		return tradeValue;
	}
	public void setTradeValue(float tradeValue) {
		this.tradeValue = tradeValue;
	}
	public float getBrokerage() {
		return brokerage;
	}
	public void setBrokerage(float brokerage) {
		this.brokerage = brokerage;
	}
	public float getTaxes() {
		return taxes;
	}
	public void setTaxes(float taxes) {
		this.taxes = taxes;
	}
	public int getContractNote() {
		return contractNote;
	}
	public void setContractNote(int contractNote) {
		this.contractNote = contractNote;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public float getLimitPrice() {
		return limitPrice;
	}
	public void setLimitPrice(float limitPrice) {
		this.limitPrice = limitPrice;
	}
	public float getViewLimit() {
		return viewLimit;
	}
	public void setViewLimit(float viewLimit) {
		this.viewLimit = viewLimit;
	}
	public String getOrderValidity() {
		return orderValidity;
	}
	public void setOrderValidity(String orderValidity) {
		this.orderValidity = orderValidity;
	}
	public float getStopLossTriggerPrice() {
		return stopLossTriggerPrice;
	}
	public void setStopLossTriggerPrice(float stopLossTriggerPrice) {
		this.stopLossTriggerPrice = stopLossTriggerPrice;
	}
}
