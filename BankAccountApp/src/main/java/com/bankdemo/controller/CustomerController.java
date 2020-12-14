package com.bankdemo.controller;

import java.util.ArrayList;
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
import com.bankdemo.model.Payee;
import com.bankdemo.model.Transaction;
import com.bankdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<List<Customer>> getAllCustomers() {

		List<Customer> customerDetails = customerService.getAllCustomers();
		return new ResponseEntity<List<Customer>>(customerDetails, HttpStatus.OK);
	}

	@RequestMapping(value = "/account-summary/{acNo}", method = RequestMethod.GET)
	public ResponseEntity<Account> getAccountSummary(@PathVariable String acNo) {
		Account account = customerService.getAccountSummery(acNo);
		return new ResponseEntity<Account>(account, HttpStatus.OK);
	}

	@RequestMapping(value = "/view-statement/{acNo}", method = RequestMethod.GET)
	public ResponseEntity<List<Object>> getAccountStatement(@PathVariable String acNo) {
		List<Object> obj = new ArrayList<Object>();
		Account account = customerService.getAccountSummery(acNo);
		List<Transaction> statements = customerService.getAccountStatements(acNo);
		obj.add(account);
		obj.add(statements);
		return new ResponseEntity<List<Object>>(obj, HttpStatus.OK);
	}

	@RequestMapping(value = "/all-payees/{custId}", method = RequestMethod.GET)
	public ResponseEntity<List<Payee>> getAllPayees(@PathVariable String custId) {
		List<Payee> payees = customerService.getAllPayees(custId);
		return new ResponseEntity<List<Payee>>(payees, HttpStatus.OK);
	}

	@RequestMapping(value = "/get-payee/{custId}/{payeeNo}", method = RequestMethod.GET)
	public ResponseEntity<Payee> getPayees(@PathVariable String custId, @PathVariable int payeeNo) {
		Payee payees = customerService.getPayee(custId, payeeNo);
		return new ResponseEntity<Payee>(payees, HttpStatus.OK);
	}

	@RequestMapping(value = "/add-payee", method = RequestMethod.POST)
	public ResponseEntity<String> addNewPayee(@RequestBody Payee payee) {
		String status = customerService.addNewPayee(payee);
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}

	@RequestMapping(value = "/update-payee", method = RequestMethod.POST)
	public ResponseEntity<String> updatePayee(@RequestBody Payee payee) {
		String status = customerService.updatePayee(payee);
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}

	@RequestMapping(value = "/delete-payee/{custId}/{payeeNo}", method = RequestMethod.POST)
	public ResponseEntity<String> deletePayee(@PathVariable String custId, @PathVariable int payeeNo) {
		String status = customerService.deletePayee(custId, payeeNo);
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}
}
