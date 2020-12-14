package com.bankdemo.service;

import java.util.List;

import com.bankdemo.model.Account;
import com.bankdemo.model.Customer;
import com.bankdemo.model.Payee;
import com.bankdemo.model.Transaction;

public interface CustomerService {

	List<Customer> getAllCustomers();

	Account getAccountSummery(String acNo);

	List<Transaction> getAccountStatements(String acNo);

	String addNewPayee(Payee payee);

	List<Payee> getAllPayees(String custId);

	String updatePayee(Payee payee);

	String deletePayee(String custId, int payeeNo);

	Payee getPayee(String custId, int payeeNo);

}
