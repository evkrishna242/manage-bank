package com.bankdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankdemo.model.Customer;


public interface CustomerRepository  extends JpaRepository<Customer, String>{

	Customer findByCustId(String custId);

}
