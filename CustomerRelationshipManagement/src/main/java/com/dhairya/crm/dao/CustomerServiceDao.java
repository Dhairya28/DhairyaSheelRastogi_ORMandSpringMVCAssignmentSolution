package com.dhairya.crm.dao;

import java.util.List;

import com.dhairya.crm.model.Customer;

public interface CustomerServiceDao {
	
	public List<Customer> findAll();

	public Customer findCustomerById(int theId);

	public void saveCustomer(Customer theCustomer);

	public void deleteCustomerById(int theId);


}
