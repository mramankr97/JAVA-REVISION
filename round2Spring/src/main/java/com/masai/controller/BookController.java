package com.masai.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.BookException;
import com.masai.model.Book;
import com.masai.service.BookService;



@RestController
public class BookController {

	@Autowired
	private BookService bService;
	
	
	@PostMapping("/books")
	public ResponseEntity<Book> addBook(@RequestBody Book book) throws BookException{
		
		Book savedBook=bService.addBook(book);
		
		return new ResponseEntity<Book>(savedBook, HttpStatus.CREATED);
	}
	
	
	
	@PutMapping("/books")
	public ResponseEntity<Book> updateBookHandler(@RequestBody Book book) throws BookException{
		
		Book updateBook=bService.updateBook(book);
		
		return new ResponseEntity<Book>(updateBook,HttpStatus.ACCEPTED);
		
	}
	
	
	@DeleteMapping("/books/{Id}")
	public ResponseEntity<Book> deleteBookByIdHandler(@PathVariable("Id")Integer bookId) throws BookException{
		
		Book delBook=bService.deleteBookId(bookId);
		
		return new ResponseEntity<Book>(delBook,HttpStatus.OK);
	}
	
	
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBookHandler() throws BookException {
		
		List<Book> book=bService.getAllBook();
		
		return new ResponseEntity<List<Book>>(book,HttpStatus.OK);
	}
	
	
	@GetMapping("/getbooks/{bookId}")
	public ResponseEntity<Book> getBookByIdHandler(@PathVariable("bookId")Integer bookId) throws BookException{
		
		Book existingBook= bService.viewBookById(bookId);
		
		return new ResponseEntity<Book>(existingBook,HttpStatus.OK);
	}
	
	
	
}
