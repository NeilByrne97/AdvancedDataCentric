package com.sales.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sales.models.Book;
import com.sales.models.Loan;

@Repository
public interface LoanRepository extends CrudRepository<Loan, Long>{
	List<Loan> findAll();
}	// LoanRepository()
