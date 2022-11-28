package com.masai.service;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.masai.dao.BookDao;

import com.masai.exceptions.BookException;
import com.masai.model.Book;


@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDao aDao;
	
	
	@Override
	public List<Book> getAllBook() throws BookException {
		
		List<Book> book= aDao.findAll();
		
		if(book.size()==0)
			throw new BookException("No book is there");
		else
		return book;
	}
	
	
	
	
	@Override
	public Book viewBookById(Integer bookId)throws BookException {
		
		Optional<Book> opt=aDao.findById(bookId);
		
		if(opt.isPresent())
		{
			return opt.get();
		}
		else
			throw new BookException("Book doesn't Exist");
	}
	
	
	
	@Override
	public Book addBook(Book book) throws BookException {
		
		Book b=aDao.save(book);
		
		return b;
	}

	
	
	@Override
	public Book updateBook(Book book) throws BookException {
		
		Optional<Book> opt= aDao.findById(book.getBookId());
		
		if(opt.isPresent()) {
			
			Book updatedBook= aDao.save(book);
			return updatedBook;
			
		}else
			throw new BookException("Invalid Book details..");
	
	}



	@Override
	public Book deleteBookId(Integer bookId) throws BookException {
		
		Optional<Book> opt= aDao.findById(bookId);
		
		if(opt.isPresent()) {
			
			Book existingbook= opt.get();
			aDao.delete(existingbook);
			
			return existingbook;
			
			
		}else
			throw new BookException("Book does not exist with Id :"+bookId);
	}
	
}
