package com.bankdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.bankdemo.model.Account;
import com.bankdemo.model.Customer;
import com.bankdemo.service.BankEmployeeService;

@Controller
@RequestMapping("/bank-employee")
public class BankEmployeeController {
	
	@Autowired
	BankEmployeeService bankEmployeeService;

	@RequestMapping(value = "/all-accounts", method = RequestMethod.GET)
	public ResponseEntity<List<Account>> getAllAccounts() {
		List<Account> accounts = bankEmployeeService.getAllAccounts();
		return new ResponseEntity<List<Account>>(accounts, HttpStatus.OK);
	}

	@RequestMapping(value = "/get-account/{acNo}", method = RequestMethod.GET)
	public ResponseEntity<Account> getAccount(@PathVariable String acNo) {
		Account account=bankEmployeeService.getAccount(acNo);
		return new ResponseEntity<Account>(account, HttpStatus.OK);
	}

	@RequestMapping(value = "/add-new-account", method = RequestMethod.POST)
	public ResponseEntity<String> addNewAccount(@RequestBody Account account) {
		String status= bankEmployeeService.addNewAccount(account);
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}

	@RequestMapping(value = "/update-account", method = RequestMethod.POST)
	public ResponseEntity<String> updateAccount(@RequestBody Account account) {
		String status= bankEmployeeService.updateAccount(account);
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}

	@RequestMapping(value = "/delete-account/{acNo}", method = RequestMethod.POST)
	public ResponseEntity<String> deleteAccount(@PathVariable String acNo) {
		String status= bankEmployeeService.deleteAccount(acNo);
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/all-customers", method = RequestMethod.GET)
	public ResponseEntity<List<Customer>> getAllCustomers() {
		List<Customer> customers = bankEmployeeService.getAllCustomers();
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/get-customer/{custId}", method = RequestMethod.GET)
	public ResponseEntity<Customer> getCustomer(@PathVariable String custId) {
		Customer customer=bankEmployeeService.getCustomer(custId);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/add-new-customer", method = RequestMethod.POST)
	public ResponseEntity<String> addNewCustomer(@RequestBody Customer customer) {
		String status= bankEmployeeService.addNewCustomer(customer);
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/update-customer", method = RequestMethod.POST)
	public ResponseEntity<String> updateCustomer(@RequestBody Customer customer) {
		String status= bankEmployeeService.updateCustomer(customer);
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}
}
