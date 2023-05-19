package com.nagarro.booksandauthorsapi.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {
	@Id
	private Integer bookcode;
	private String bookname;
	private Date dateadded;
	
	@ManyToOne(cascade=CascadeType.MERGE)
	private Author author;
	
	public Integer getBookcode() {
		return bookcode;
	}
	public void setBookcode(Integer bookcode) {
		this.bookcode = bookcode;
	}
	
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	public Date getDateadded() {
		return dateadded;
	}
	public void setDateadded(Date dateadded) {
		this.dateadded = dateadded;
	}
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [bookcode=" + bookcode + ", bookname=" + bookname + ", dateadded=" + dateadded + ", author="
				+ author + "]";
	}
}
