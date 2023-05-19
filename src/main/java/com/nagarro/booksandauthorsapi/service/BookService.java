package com.nagarro.booksandauthorsapi.service;

import java.util.List;
import java.util.Optional;

import com.nagarro.booksandauthorsapi.entity.Book;

public interface BookService {
	
	List<Book> getAuthor();
	Optional<Book> findAuthorById(int id);
	void saveOrUpdateAuthor(Book book);
	void deleteAuthor();
	void deleteAuthorById(int id);

}
