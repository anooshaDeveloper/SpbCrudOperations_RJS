package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.IBookService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	IBookService bookService;
	
	@PostMapping("/books")  
	public void addBook(@RequestBody Book book) {
		bookService.save(book);
	}
	
	@GetMapping("/getBook/{bookid}")  
	public Book getBooks(@PathVariable("bookid") int bookid)   
	{  
	return bookService.getBook(bookid);  
	} 
	
	@GetMapping("/deleteBook/{bookid}")  
	public void deleteBook(@PathVariable("bookid") int bookid)   
	{  
	bookService.delete(bookid);  
	} 
	@GetMapping("/getAllBooks")  
	public List<Book> getAllBooks()   
	{  
	return bookService.getAllBooks();  
	} 
}
