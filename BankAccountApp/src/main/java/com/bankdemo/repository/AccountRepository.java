package com.bankdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankdemo.model.Account;

public interface AccountRepository  extends JpaRepository<Account, String>{

	Account findByAcNumber(String string);

	String deleteByAcNumber(String acNo);

}
