package com.bankdemo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

	@Id
	@Column(name = "custid")
	/* @GeneratedValue(strategy = GenerationType.IDENTITY) */
	private String custId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "middle_name")
	private String middleName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "city")
	private String city;
	@Column(name = "mobile_no")
	private String mobileNo;
	@Column(name = "email")
	private String email;
	@Column(name = "occupation")
	private String occupation;
	@Column(name = "dob")
	private Date dob;

	
	public Customer() {}
	
	public Customer(String custId, String firstName, String middleName, String lastName, String city, String mobileNo,
			String email, String occupation, Date dob) {
		super();
		this.custId = custId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.city = city;
		this.mobileNo = mobileNo;
		this.email = email;
		this.occupation = occupation;
		this.dob = dob;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", city=" + city + ", mobileNo=" + mobileNo + ", email=" + email + ", occupation="
				+ occupation + ", dob=" + dob + "]";
	}
	
	

}
