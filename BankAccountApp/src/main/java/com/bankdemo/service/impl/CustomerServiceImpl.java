package com.bankdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankdemo.model.Account;
import com.bankdemo.model.Customer;
import com.bankdemo.model.Payee;
import com.bankdemo.model.Transaction;
import com.bankdemo.repository.AccountRepository;
import com.bankdemo.repository.CustomerRepository;
import com.bankdemo.repository.PayeeRepository;
import com.bankdemo.repository.TransactionRepository;
import com.bankdemo.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private TransactionRepository transactionRepository;

	@Autowired
	PayeeRepository payeeRepository;

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();

	}

	@Override
	public Account getAccountSummery(String acNo) {
		return accountRepository.findByAcNumber(acNo);

	}

	@Override
	public List<Transaction> getAccountStatements(String acNo) {

		return transactionRepository.findByAcNumber(acNo);
	}

	@Override
	public String addNewPayee(Payee payee) {
		payeeRepository.save(payee);
		return "Payee Added Successfully";
	}

	@Override
	public List<Payee> getAllPayees(String custId) {
		return payeeRepository.findByCustId(custId);
	}
	
	@Override
	public Payee getPayee(String custId, int payeeNo) {
		return payeeRepository.findByCustIdAndPayeeNo(custId, payeeNo);
	}
	
	@Override
	public String updatePayee(Payee payee) {
		Payee updatePayee = payeeRepository.findByCustIdAndPayeeNo(payee.getCustId(), payee.getPayeeNo());
		if (updatePayee != null) {
			updatePayee.setPayeeFirstNamne(payee.getPayeeFirstNamne());
			updatePayee.setPayeeLastName(payee.getPayeeLastName());
			updatePayee.setPayeeBankName(payee.getPayeeBankName());
			updatePayee.setPayeeBankIFSC(payee.getPayeeBankIFSC());
			updatePayee.setPayeeBankAcNo(payee.getPayeeBankAcNo());
			updatePayee.setPayeeStatus(payee.getPayeeStatus());
			payeeRepository.save(updatePayee);
		} else {
			payeeRepository.save(payee);
		}
		return "Payee Updated Successfully";
	}

	@Override
	public String deletePayee(String custId, int payeeNo) {
		Payee deletePayee = payeeRepository.findByCustIdAndPayeeNo(custId, payeeNo);
		if(deletePayee!=null) {
			payeeRepository.deleteByCustIdAndPayeeNo(custId, payeeNo);
			return "Payee Deleted Successfully";
		}else {
			return "Some thing went Wrong.Please Try again.";
		}
		
	}

	

}
