package com.bankdemo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT")
public class Account {

	@Id
	@Column(name = "acnumber")
	private String acNumber;
	@Column(name = "custid")
	private String custId;
	@Column(name = "bank_id")
	private String bankId;
	@Column(name = "opening_balance")
	private double openingBalance;
	@Column(name = "closing_balance")
	private double closingBalance;
	@Column(name = "created_on")
	private Date createdOn;
	@Column(name = "atype")
	private String aType;
	@Column(name = "astatus")
	private String aStatus;

	public Account() {}
	
	
	public Account(String acNumber, String custId, String bankId, double openingBalance, double closingBalance,
			Date createdOn, String aType, String aStatus) {
		super();
		this.acNumber = acNumber;
		this.custId = custId;
		this.bankId = bankId;
		this.openingBalance = openingBalance;
		this.closingBalance = closingBalance;
		this.createdOn = createdOn;
		this.aType = aType;
		this.aStatus = aStatus;
	}


	public String getAcNumber() {
		return acNumber;
	}

	public void setAcNumber(String acNumber) {
		this.acNumber = acNumber;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public double getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}

	public double getClosingBalance() {
		return closingBalance;
	}

	public void setClosingBalance(double closingBalance) {
		this.closingBalance = closingBalance;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getaType() {
		return aType;
	}

	public void setaType(String aType) {
		this.aType = aType;
	}

	public String getaStatus() {
		return aStatus;
	}

	public void setaStatus(String aStatus) {
		this.aStatus = aStatus;
	}

}
