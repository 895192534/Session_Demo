package com.lhk.shoppingServlet;

public class Customer {
	private String name;
	private String address;
	private String information;
	private String cardType;
	private String cardNum;
	
	public Customer(String name, String address, String information, String cardType, String cardNum) {
		super();
		this.name = name;
		this.address = address;
		this.information = information;
		this.cardType = cardType;
		this.cardNum = cardNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
}
