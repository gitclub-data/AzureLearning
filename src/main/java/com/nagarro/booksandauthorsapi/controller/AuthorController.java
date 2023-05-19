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

import com.nagarro.booksandauthorsapi.entity.Author;
import com.nagarro.booksandauthorsapi.service.AuthorService;

@RestController
public class AuthorController {

	@Autowired
	AuthorService service;
	
	@GetMapping(path="/authors")
	public List<Author> GetAuthors() {
		return service.getAuthor();
	}
	
	@GetMapping(path="/authors/{id}")
	public Optional<Author> GetAuthor(@PathVariable("id") int id) {
		return service.findAuthorById(id);
	}
	
	@PostMapping(path="/authors")
	public void saveAuthor(@RequestBody Author author) {
		service.saveOrUpdateAuthor(author);
	}
	
	@DeleteMapping(path="/authors")
	public void deleteAuthors() {
		service.deleteAuthor();
	}
	
	@DeleteMapping(path="/authors/{id}")
	public void deleteAuthor(@PathVariable("id") int id) {
		service.deleteAuthorById(id);
	}
	
	@PutMapping(path="/authors")
	public void updateAuthor(@RequestBody Author author) {
		service.saveOrUpdateAuthor(author);
	}
}
