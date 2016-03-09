package com.igate.tradingsimulator.domain;

import java.io.Serializable;
import java.util.Date;

public class TradeTxn implements Serializable{

	private static final long serialVersionUID = -8819525346144322663L;
	private int id;
	private User user;
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
	private Date creationDate;
	private Date executionDate;
	private String executionStatus;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
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
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getExecutionDate() {
		return executionDate;
	}
	public void setExecutionDate(Date executionDate) {
		this.executionDate = executionDate;
	}
	public String getExecutionStatus() {
		return executionStatus == null? "N" : executionStatus ;
	}
	public void setExecutionStatus(String executionStatus) {
		this.executionStatus = executionStatus;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "TradeTxn [id=" + id + ", user=" + user.toString() + ", action=" + action
				+ ", stock=" + stock + ", product=" + product + ", exchange="
				+ exchange + ", quantity=" + quantity + ", orderType="
				+ orderType + ", limitPrice=" + limitPrice + ", viewLimit="
				+ viewLimit + ", orderValidity=" + orderValidity
				+ ", stopLossTriggerPrice=" + stopLossTriggerPrice
				+ ", creationDate=" + creationDate + ", executionDate="
				+ executionDate + ", executionStatus=" + executionStatus + "]";
	}
}
