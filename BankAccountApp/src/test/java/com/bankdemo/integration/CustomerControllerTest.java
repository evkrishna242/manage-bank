package com.bankdemo.integration;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.bankdemo.model.Account;
import com.bankdemo.model.Branch;
import com.bankdemo.model.Customer;
import com.bankdemo.model.Payee;
import com.bankdemo.model.Transaction;
import com.bankdemo.repository.AccountRepository;
import com.bankdemo.repository.BranchRepository;
import com.bankdemo.repository.CustomerRepository;
import com.bankdemo.repository.PayeeRepository;
import com.bankdemo.repository.TransactionRepository;
import com.bankdemo.service.CustomerService;

public class CustomerControllerTest {

	@Autowired
	CustomerService customerService;
	
	@Autowired
	BranchRepository branchRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	PayeeRepository payeeRepository;
	
	@Autowired
	TransactionRepository transactionRepository;


	@Test
	public void insertData() {
		Branch branch=new Branch();
		branch.setBankId("BANK01");
		branch.setBankName("Test Bank1");
		branch.setBankCity("Chennai");
		branch.setBankIfsc("TEST00011");
		//branchRepository.save(branch);
		
		Customer customer=new Customer();
		customer.setCustId("100001");
		customer.setFirstName("John");
		customer.setMiddleName("");
		customer.setLastName("Doe");
		customer.setCity("Chennai");
		customer.setMobileNo("9876543210");
		customer.setEmail("sample@mail.com");
		customer.setOccupation("Business");
		customer.setDob(null);
		//customerRepository.save(customer);
		
		Account account=new Account();
		account.setAcNumber("500001");
		account.setCustId("100001");
		account.setBankId("BANK01");
		account.setOpeningBalance(100000.00);
		account.setClosingBalance(100000.00);
		account.setCreatedOn(null);
		account.setaType("Savings");
		account.setaStatus("Active");		
		//accountRepository.save(account);
		
		Payee payee=new Payee();
		payee.setPayeeID("P00001");
		payee.setCustId("100001");
		payee.setPayeeNo(1);
		payee.setPayeeFirstNamne("One");
		payee.setPayeeLastName("Test");
		payee.setPayeeBankName("Test Bank1");
		payee.setPayeeBankIFSC("TEST00011");
		payee.setPayeeBankAcNo("700001");
		payee.setPayeeStatus("Active");
		payee.setCreatedOn(null);
		//payeeRepository.save(payee);
		
		Transaction transaction1=new Transaction();
		transaction1.setTrNumber("100000000001");
		transaction1.setAcNumber("500001");
		transaction1.setCustId("100001");
		transaction1.setTrDate(null);
		transaction1.setTrDescription("Transaction");
		transaction1.setTrAmount("1000");
		transaction1.setTrType("Cr");
		//transactionRepository.save(transaction1);
		
		Transaction transaction2=new Transaction();
		transaction2.setTrNumber("100000000002");
		transaction2.setAcNumber("500001");
		transaction2.setCustId("100001");
		transaction2.setTrDate(null);
		transaction2.setTrDescription("Transaction");
		transaction2.setTrAmount("100");
		transaction2.setTrType("Dr");
		//transactionRepository.save(transaction2);
	}
	
	@Test
	public void testPayees() throws Exception{
		//customerService.getAllPayees("100001");
	}
	
	@Test
	public void addPayee()  throws Exception{
		Payee payee=new Payee();
		payee.setPayeeID("P00001");
		payee.setCustId("100001");
		payee.setPayeeNo(1);
		payee.setPayeeFirstNamne("One");
		payee.setPayeeLastName("Test");
		payee.setPayeeBankName("Test Bank1");
		payee.setPayeeBankIFSC("TEST00011");
		payee.setPayeeBankAcNo("700001");
		payee.setPayeeStatus("Active");
		payee.setCreatedOn(new Date());			
		//customerService.addNewPayee(payee);
	}
	
}
