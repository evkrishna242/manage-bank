package com.bankdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankdemo.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, String> {

	List<Transaction> findByAcNumber(String acNo);

}
