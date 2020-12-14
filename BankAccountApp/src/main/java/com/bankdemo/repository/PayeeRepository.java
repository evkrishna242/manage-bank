package com.bankdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankdemo.model.Payee;

public interface PayeeRepository extends JpaRepository<Payee, String> {

	List<Payee> findByCustId(String custId);

	Payee findByCustIdAndPayeeNo(String custId, int payeeNo);

	void deleteByCustIdAndPayeeNo(String custId, int payeeNo);

}
