package com.nagarro.booksandauthorsapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.booksandauthorsapi.entity.Author;

public interface AuthorRepo extends JpaRepository<Author, Integer> {
	List<Author> findByAuthorname(String authorname);
}
