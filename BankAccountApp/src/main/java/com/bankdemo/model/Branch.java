package com.bankdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BRANCH")
public class Branch {
	@Id
	@Column(name = "bank_id")
	private String bankId;
	@Column(name = "bank_name")
	private String bankName;
	@Column(name = "bank_city")
	private String bankCity;
	@Column(name = "bank_ifsc")
	private String bankIfsc;

	public Branch() {}
	
	
	public Branch(String bankId, String bankName, String bankCity, String bankIfsc) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.bankCity = bankCity;
		this.bankIfsc = bankIfsc;
	}


	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankCity() {
		return bankCity;
	}

	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}

	public String getBankIfsc() {
		return bankIfsc;
	}

	public void setBankIfsc(String bankIfsc) {
		this.bankIfsc = bankIfsc;
	}

}
