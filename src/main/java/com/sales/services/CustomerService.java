package com.sales.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sales.models.Customer;
import com.sales.repositories.CustomerRepository;
import java.util.*;

@Service
public class CustomerService 
{
	@Autowired
	CustomerRepository cr;
	
	public ArrayList<Customer> findCustomers()
	{ 
		return (ArrayList<Customer>) cr.findAll();
	}// findCustomers
	
	public Customer saveCustomer(Customer customer)
	{
		return cr.save(customer);
	}// saveCustomer
}// CustomerService
