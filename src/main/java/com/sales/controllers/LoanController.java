package com.sales.controllers;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.sales.models.Loan;
import com.sales.services.LoanService;

@Controller
public class LoanController {
	@Autowired
	LoanService ls;
	
	@RequestMapping(value="/showLoans", method=RequestMethod.GET)
	public String getLoans(Model m){	// Reads book DB for view loans page
		ArrayList<Loan> loans = ls.findLoans();
		m.addAttribute("loans", loans);
		return "showLoans";
	}	// getLoans()
		
	@RequestMapping(value="/newLoan", method=RequestMethod.GET)	// Reads book DB to add into addLoan page
	public String newLoanGet(@ModelAttribute("loanNew") Loan loan, HttpServletRequest h){
		return "newLoan";
	}	// newLoanGet() 
	
	@RequestMapping(value="/newLoan", method=RequestMethod.POST)	// Post method used for writing new entries to the DB
	public String newLoanPost(@Valid @ModelAttribute("loanNew") Loan loan, BindingResult res){
		if(res.hasErrors())
			return "newLoan";
		
		ls.saveLoan(loan);
		return "redirect:showLoans";
	}	// newLoanPost()
	
}	// LoanController class
