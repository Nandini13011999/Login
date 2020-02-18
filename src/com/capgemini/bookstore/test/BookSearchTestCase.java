package com.capgemini.bookstore.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.bookstore.dao.BookDaoImpl;
import com.capgemini.bookstore.dao.IBookDao;
import com.capgemini.bookstore.entites.Book;

public class BookSearchTestCase {
	
	Book book;
//	Book book1 = new Book(2332,"java book",122);
	
	
	IBookDao dao;
	@Before
	public void init() {
		book = new Book(1234,"my book",456);

		dao= new BookDaoImpl();
		dao.addBook(book);
	}
	
	@Test
	public void searchTest() {
		assertEquals(book, dao.searchBook(book));
	}

}
