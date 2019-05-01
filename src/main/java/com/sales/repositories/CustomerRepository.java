package com.sales.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sales.models.Book;
import com.sales.models.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{
	List<Customer> findAll();
}	// CustomerRepository()
