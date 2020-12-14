package com.bankdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankdemo.model.Branch;

public interface BranchRepository extends JpaRepository<Branch, String>{

}
