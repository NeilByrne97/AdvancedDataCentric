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
import com.sales.models.Book;
import com.sales.services.BookService;

@Controller
public class BookController{
	@Autowired
	BookService bs;
	
	@RequestMapping(value = "/showBooks", method = RequestMethod.GET)
	public String getBooks(Model m){	// Reads book DB for view books page
		ArrayList<Book> books =  bs.findBooks();
		m.addAttribute("books", books);
		return "showBooks";
	}	// getBooks()
	
	@RequestMapping(value = "/addBook", method=RequestMethod.GET)	// Reads book DB to add into addBook page
	public String addBookGet(@ModelAttribute("bookAdd") Book book, HttpServletRequest h){
		return "addBook";
	}	// addBookGet()
	
	@RequestMapping(value="/addBook", method=RequestMethod.POST) 	// Post method used for writing new entries to the DB

	public String addBookPost(@Valid @ModelAttribute("bookAdd")  Book book, BindingResult res){
		if(res.hasErrors())
			return "addBook";
		
		bs.saveBook(book);
		return "redirect:showBooks";
	}	// addBookPost()	
}	// BookController class
