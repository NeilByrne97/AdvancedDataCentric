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

import com.sales.models.Customer;
import com.sales.services.CustomerService;

@Controller
public class CustomerController{
	@Autowired
	CustomerService cs;
	
	@RequestMapping(value="/showCustomers", method=RequestMethod.GET)
	public String getCustomers(Model m){	// Reads customer DB for view books page
		ArrayList<Customer> customers = cs.findCustomers();
		m.addAttribute("customers", customers);
		return "showCustomers";
	}	// getCustomers()
	
	@RequestMapping(value="/addCustomer", method=RequestMethod.GET)	// Reads customer DB to add into addBook page
	public String addCustomerGet(@ModelAttribute("customerAdd") Customer customer, HttpServletRequest h){
		return "addCustomer";
	}	// addCustomerGet()
	
	@RequestMapping(value="/addCustomer", method=RequestMethod.POST)	// Post method used for writing new entries to the DB
	public String addCustomerPost(@Valid @ModelAttribute("customerAdd") Customer customer, BindingResult res){
		if(res.hasErrors())
			return "addCustomer";
		
		cs.saveCustomer(customer);
		return "redirect:showCustomers";
	}	// addCustomerPost()
}	// CustomerController class
