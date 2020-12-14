package com.bankdemo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.bankdemo.dao.CustomerDao;
import com.bankdemo.model.Customer;;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@PersistenceContext
    private EntityManager entityManager;
	
	public List<Customer> getCustomerDetails() {
		Criteria criteria = entityManager.unwrap(Session.class).createCriteria(Customer.class);
		return criteria.list();
	}

}
