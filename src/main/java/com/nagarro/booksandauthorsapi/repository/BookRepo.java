package com.nagarro.booksandauthorsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.booksandauthorsapi.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

}
