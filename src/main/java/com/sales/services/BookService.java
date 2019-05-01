package com.sales.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sales.models.Book;
import com.sales.repositories.BookRepository;
import java.util.*;

@Service
public class BookService 
{
	@Autowired
	BookRepository br;
	
    public ArrayList<Book> findBooks()
    {
        return (ArrayList<Book>) br.findAll();
    }// findBooks
    
    public Book saveBook(Book book)
    {
    	return br.save(book);
    }//saveBook
}// BookService
