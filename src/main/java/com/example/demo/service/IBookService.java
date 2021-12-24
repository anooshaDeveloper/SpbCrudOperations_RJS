package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Book;

public interface IBookService {
	
	
	public Integer save(Book book);
	
	public List<Book> getAllBooks();
	
	public void delete(Integer id);
	
	public Book getBook(Integer id);

}
