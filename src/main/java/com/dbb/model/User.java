package com.dbb.model;

import java.util.List;

public class User {
	
	

    public String userPin ;
    public String currency ;
    public String country ;
    public double accountNumber;
    public String userFullName;
    public List<FromAccount> fromAccounts;
    public List<ToAccount> toAccounts;
	public String getUserPin() {
		return userPin;
	}
	public void setUserPin(String userPin) {
		this.userPin = userPin;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getUserFullName() {
		return userFullName;
	}
	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}
	public List<FromAccount> getFromAccounts() {
		return fromAccounts;
	}
	public void setFromAccounts(List<FromAccount> fromAccounts) {
		this.fromAccounts = fromAccounts;
	}
	public List<ToAccount> getToAccounts() {
		return toAccounts;
	}
	public void setToAccounts(List<ToAccount> toAccounts) {
		this.toAccounts = toAccounts;
	}
    
    

}
