package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repo.IBookRepo;
@Service
public class BookServiceImpl implements IBookService {
	
	@Autowired
	IBookRepo bookRepo;
	
	public Integer save(Book book) {
		Book books=bookRepo.save(book);		
		return books.getBookid();
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		List<Book> books=bookRepo.findAll();
		return books;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		bookRepo.deleteById(id);  
	}

	@Override
	public Book getBook(Integer id) {
		Optional<Book> book=bookRepo.findById(id);
		return book.get();
	}

}
