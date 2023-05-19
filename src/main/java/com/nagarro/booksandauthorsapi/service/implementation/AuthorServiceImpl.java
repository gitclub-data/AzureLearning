package com.nagarro.booksandauthorsapi.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.booksandauthorsapi.entity.Author;
import com.nagarro.booksandauthorsapi.repository.AuthorRepo;
import com.nagarro.booksandauthorsapi.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService{

	@Autowired
	AuthorRepo repo;
	
	@Override
	public List<Author> getAuthor() {
		return repo.findAll();
	}

	@Override
	public Optional<Author> findAuthorById(int id) {
		return repo.findById(id);
	}

	@Override
	public void saveOrUpdateAuthor(Author author) {
		repo.save(author);
	}

	@Override
	public void deleteAuthor() {
		repo.deleteAll();
		
	}

	@Override
	public void deleteAuthorById(int id) {
		repo.deleteById(id);	
	}
	
}
