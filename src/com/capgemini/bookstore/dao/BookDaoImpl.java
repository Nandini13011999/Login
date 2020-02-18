package com.capgemini.bookstore.dao;

import java.util.HashMap;

import com.capgemini.bookstore.entites.Book;

public class BookDaoImpl implements IBookDao {

	HashMap<Integer, Book> map;

	public BookDaoImpl() {
		map = new HashMap<>();
	}

	@Override
	public boolean addBook(Book book) {
		
		if (searchBook(book) == null) {
			
			map.put(book.getIsbn(), book);
			return true;
		}

		return false;
	}

	@Override
	public Book searchBook(Book book) {
		if (map.containsKey(book.getIsbn()))
			return map.get(book.getIsbn());
		else
			return null;
	}

	@Override
	public HashMap<Integer, Book> getAllBook() {
		return map;
	}

	@Override
	public boolean deleteBook(Book book) {
		if (searchBook(book) != null) {
			map.remove(book.getIsbn());
			return true;
		}
		return false;
		// TODO Auto-generated method stub

	}

}
