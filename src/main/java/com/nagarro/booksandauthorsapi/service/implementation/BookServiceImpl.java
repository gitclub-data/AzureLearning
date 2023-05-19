package com.nagarro.booksandauthorsapi.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.booksandauthorsapi.entity.Book;
import com.nagarro.booksandauthorsapi.repository.BookRepo;
import com.nagarro.booksandauthorsapi.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookRepo repo;

	@Override
	public List<Book> getAuthor() {
		return repo.findAll();
	}

	@Override
	public Optional<Book> findAuthorById(int id) {
		return repo.findById(id);
	}

	@Override
	public void saveOrUpdateAuthor(Book book) {
		repo.save(book);
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
