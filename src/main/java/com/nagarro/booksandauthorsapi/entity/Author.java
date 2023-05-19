package com.nagarro.booksandauthorsapi.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Author {

	@Id
	private Integer id;
	private String authorname;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "author",cascade=CascadeType.ALL)
	@JsonIgnore
	private List<Book> books = new ArrayList<Book>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", authorname=" + authorname + ", books=" + books + "]";
	} 	
	
}
