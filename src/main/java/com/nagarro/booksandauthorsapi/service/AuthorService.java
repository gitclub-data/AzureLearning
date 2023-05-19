package com.nagarro.booksandauthorsapi.service;

import java.util.List;
import java.util.Optional;

import com.nagarro.booksandauthorsapi.entity.Author;

public interface AuthorService {
	List<Author> getAuthor();
	Optional<Author> findAuthorById(int id);
	void saveOrUpdateAuthor(Author author);
	void deleteAuthor();
	void deleteAuthorById(int id);
}
