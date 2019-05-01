package com.sales.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sales.models.Loan;
import com.sales.repositories.LoanRepository;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class LoanService
{
	@Autowired
	LoanRepository lr;

	
	private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	private Calendar calendar = Calendar.getInstance();
	
	public ArrayList<Loan> findLoans()
	{
		return (ArrayList<Loan>) lr.findAll();
	}// findLoans
		
    public Loan saveLoan(Loan loan)
    {
    	// imported Calendar class to order the date
    	calendar.add(Calendar.DAY_OF_MONTH, loan.getCust().getLoanPeriod());
    	String dueDate = dateFormat.format(calendar.getTime()); 
    	loan.setDueDate(dueDate);	
    	
    	return lr.save(loan);
    }// saveBook
    
    public void deleteLoan(Loan loan)
    {
    	lr.delete(loan);
    }// deleteLoan
}// LoanService
