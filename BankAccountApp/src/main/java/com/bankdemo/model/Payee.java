package com.bankdemo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PAYEE")
public class Payee {
	
	@Id
	@Column(name = "payee_id")
	private String payeeID;
	@Column(name = "custid")
	private String custId; 
	@Column(name = "payee_no")
	private int payeeNo; 
	@Column(name = "payee_fname")
	private String payeeFirstNamne;
	@Column(name = "payee_lname")
	private String payeeLastName;
	@Column(name = "payee_bank_name")
	private String payeeBankName;
	@Column(name = "payee_bank_ifsc")
	private String payeeBankIFSC;
	@Column(name = "payee_bank_acno")
	private String payeeBankAcNo; 
	@Column(name = "payee_status")
	private String payeeStatus; 
	@Column(name = "created_on")
	private Date createdOn;
	
	public Payee() {}
	
	
	public Payee(String payeeID, String custId, int payeeNo, String payeeFirstNamne, String payeeLastName,
			String payeeBankName, String payeeBankIFSC, String payeeBankAcNo, String payeeStatus, Date createdOn) {
		super();
		this.payeeID = payeeID;
		this.custId = custId;
		this.payeeNo = payeeNo;
		this.payeeFirstNamne = payeeFirstNamne;
		this.payeeLastName = payeeLastName;
		this.payeeBankName = payeeBankName;
		this.payeeBankIFSC = payeeBankIFSC;
		this.payeeBankAcNo = payeeBankAcNo;
		this.payeeStatus = payeeStatus;
		this.createdOn = createdOn;
	}


	public String getPayeeID() {
		return payeeID;
	}


	public void setPayeeID(String payeeID) {
		this.payeeID = payeeID;
	}


	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public int getPayeeNo() {
		return payeeNo;
	}
	public void setPayeeNo(int payeeNo) {
		this.payeeNo = payeeNo;
	}
	public String getPayeeFirstNamne() {
		return payeeFirstNamne;
	}
	public void setPayeeFirstNamne(String payeeFirstNamne) {
		this.payeeFirstNamne = payeeFirstNamne;
	}
	public String getPayeeLastName() {
		return payeeLastName;
	}
	public void setPayeeLastName(String payeeLastName) {
		this.payeeLastName = payeeLastName;
	}
	public String getPayeeBankName() {
		return payeeBankName;
	}
	public void setPayeeBankName(String payeeBankName) {
		this.payeeBankName = payeeBankName;
	}
	public String getPayeeBankIFSC() {
		return payeeBankIFSC;
	}
	public void setPayeeBankIFSC(String payeeBankIFSC) {
		this.payeeBankIFSC = payeeBankIFSC;
	}
	public String getPayeeBankAcNo() {
		return payeeBankAcNo;
	}
	public void setPayeeBankAcNo(String payeeBankAcNo) {
		this.payeeBankAcNo = payeeBankAcNo;
	}
	public String getPayeeStatus() {
		return payeeStatus;
	}
	public void setPayeeStatus(String payeeStatus) {
		this.payeeStatus = payeeStatus;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
		
}
