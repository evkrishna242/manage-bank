package com.bankdemo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANSACTION")
public class Transaction {

	@Id
	@Column(name = "transaction_number")
	private String trNumber;
	@Column(name = "acnumber")
	private String acNumber;
	@Column(name = "custid")
	private String custId;
	@Column(name = "transaction_date")
	private Date trDate;
	@Column(name = "transaction_description")
	private String trDescription;
	@Column(name = "transaction_amount")
	private String trAmount;
	@Column(name = "transaction_type")
	private String trType;

	public Transaction() {
	}

	public Transaction(String trNumber, String acNumber, String custId, Date trDate, String trDescription,
			String trAmount, String trType) {
		super();
		this.trNumber = trNumber;
		this.acNumber = acNumber;
		this.custId = custId;
		this.trDate = trDate;
		this.trDescription = trDescription;
		this.trAmount = trAmount;
		this.trType = trType;
	}

	public String getTrNumber() {
		return trNumber;
	}

	public void setTrNumber(String trNumber) {
		this.trNumber = trNumber;
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

	public Date getTrDate() {
		return trDate;
	}

	public void setTrDate(Date trDate) {
		this.trDate = trDate;
	}

	public String getTrDescription() {
		return trDescription;
	}

	public void setTrDescription(String trDescription) {
		this.trDescription = trDescription;
	}

	public String getTrAmount() {
		return trAmount;
	}

	public void setTrAmount(String trAmount) {
		this.trAmount = trAmount;
	}

	public String getTrType() {
		return trType;
	}

	public void setTrType(String trType) {
		this.trType = trType;
	}

}
