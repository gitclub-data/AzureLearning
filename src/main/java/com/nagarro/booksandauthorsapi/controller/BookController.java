package com.nagarro.booksandauthorsapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.booksandauthorsapi.entity.Book;
import com.nagarro.booksandauthorsapi.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService service;
	
	@GetMapping(path="/books")
	public List<Book> getBooks() {
		return service.getAuthor();
	}
	
	@GetMapping(path="/books/{id}")
	public Optional<Book> getBook(@PathVariable("id") int id) {
		return service.findAuthorById(id);
	}
	
	@PostMapping(path="/books")
	public void saveBook(@RequestBody Book book) {
		service.saveOrUpdateAuthor(book);
	}
	
	@DeleteMapping(path="/books")
	public void deletebooks() {
		service.deleteAuthor();
	}
	
	@DeleteMapping(path="/books/{id}")
	public void deleteBook(@PathVariable("id") int id) {
		service.deleteAuthorById(id);
	}
	
	@PutMapping(path="/books")
	public void updateBook(@RequestBody Book book) {
		service.saveOrUpdateAuthor(book);
	}
	
}
