package com.capgemini.bookstore.service;

import com.capgemini.bookstore.entites.Book;
import com.capgemini.bookstore.exception.BookException;

public interface IBookService {
	void searchBook(int isbn) throws BookException;
	void addBooktoKart(Book book);
	void totalCost();
	void removeBook(int isbn) throws BookException;
	void allBookDetail();

}
