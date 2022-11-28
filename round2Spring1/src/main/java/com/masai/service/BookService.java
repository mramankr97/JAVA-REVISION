package com.masai.service;

import java.util.List;
import java.util.Optional;

import com.masai.exceptions.BookException;
import com.masai.model.Book;



public interface BookService {
	
	public List<Book> getAllBook() throws BookException;
	
	public Book viewBookById(Integer bookId)throws BookException;
	
	public Book addBook(Book book)throws BookException;

	public Book deleteBookId(Integer bookId) throws BookException;
	
	public Book updateBook(Book book)throws BookException;
	
}
