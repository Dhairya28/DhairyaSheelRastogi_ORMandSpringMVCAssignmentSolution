package com.dhairya.crm.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dhairya.crm.model.Customer;


import javax.persistence.Query;
import javax.transaction.Transactional;

@Repository
public class CustomerServiceDaoImpl implements CustomerServiceDao{
	@Autowired
	SessionFactory factory;

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(customer);
	}

	@Override
	@Transactional
	public Customer findCustomerById(int id) {
		Session session = factory.getCurrentSession();
		Customer st = session.get(Customer.class, id);
		System.out.println(st);
		return st;
	}

	@Override
	@Transactional
	public List<Customer> findAll() {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("from Customer");
		return query.getResultList();
	}

	@Override
	@Transactional
	public void deleteCustomerById(int id) {
		Session session = factory.getCurrentSession();
		Customer ct = session.load(Customer.class, id);
		session.delete(ct);

	}
}
