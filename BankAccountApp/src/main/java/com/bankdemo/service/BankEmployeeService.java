package com.bankdemo.service;

import java.util.List;

import com.bankdemo.model.Account;
import com.bankdemo.model.Customer;

public interface BankEmployeeService {

	List<Account> getAllAccounts();
	Account getAccount(String acNo);
	public String addNewAccount(Account account);
	public String updateAccount(Account account);
	public String deleteAccount(String acNo);
	List<Customer> getAllCustomers();
	Customer getCustomer(String custId);
	String addNewCustomer(Customer customer);
	String updateCustomer(Customer customer);
	
	
}
