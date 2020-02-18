package com.capgemini.bookstore.dao;

import java.util.HashMap;

import com.capgemini.bookstore.entites.Book;

public interface IBookDao {
	
	boolean addBook(Book book);
	HashMap<Integer, Book> getAllBook();
	
	Object searchBook(Book book);
	boolean deleteBook(Book book);

}
