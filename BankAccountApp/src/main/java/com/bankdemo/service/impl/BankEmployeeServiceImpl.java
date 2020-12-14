package com.bankdemo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankdemo.model.Account;
import com.bankdemo.model.Customer;
import com.bankdemo.repository.AccountRepository;
import com.bankdemo.repository.CustomerRepository;
import com.bankdemo.service.BankEmployeeService;

@Service
@Transactional
public class BankEmployeeServiceImpl implements BankEmployeeService{

	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public List<Account> getAllAccounts() {		
		return accountRepository.findAll();
	}
	
	@Override
	public Account getAccount(String acNo) {
		return accountRepository.findByAcNumber(acNo);
		
	}
	@Override
	public String addNewAccount(Account account) {
		accountRepository.save(account);
		return "Account Cretaed Successfully";
	}

	@Override
	public String updateAccount(Account account) {
		Account updateAccount = accountRepository.findByAcNumber(account.getAcNumber());
		if(updateAccount!=null)
		{
			updateAccount.setaStatus(account.getaStatus());
			updateAccount.setBankId(account.getBankId());
			updateAccount.setaType(account.getaType());
			updateAccount.setaStatus(account.getaStatus());					
			accountRepository.save(updateAccount);			
		}else {
			accountRepository.save(account);
		}
		return "Account Updated Successfully";
	}
	@Override
	public String deleteAccount(String acNo) {
		Account deleteAccount = accountRepository.findByAcNumber(acNo);
		if(deleteAccount!=null) {
			accountRepository.deleteByAcNumber(acNo);
			return "Account Deleted Successfully";
		}else {
			return "Some thing went Wrong.Please Try again.";
		}
		
	}
	@Override
	public List<Customer> getAllCustomers() {		
		return customerRepository.findAll();
	}
	
	@Override
	public Customer getCustomer(String custId) {
		return customerRepository.findByCustId(custId);
	}
	@Override
	public String addNewCustomer(Customer customer) {
		customerRepository.save(customer);
		return "Customer Cretaed Successfully";
	}
	@Override
	public String updateCustomer(Customer customer) {
		Customer updateCustomer=customerRepository.findByCustId(customer.getCustId());
		if(updateCustomer!=null) {
			updateCustomer.setCity(customer.getCity());
			updateCustomer.setFirstName(customer.getFirstName());
			updateCustomer.setLastName(customer.getLastName());
			updateCustomer.setMiddleName(customer.getMiddleName());
			updateCustomer.setMobileNo(customer.getMobileNo());			
			updateCustomer.setEmail(customer.getEmail());
			updateCustomer.setOccupation(customer.getOccupation());
			updateCustomer.setDob(customer.getDob());
			customerRepository.save(updateCustomer);
		}else {
			customerRepository.save(customer);
		}
		return "Customer Updated Successfully";
	}

}
