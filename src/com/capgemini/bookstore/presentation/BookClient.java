package com.capgemini.bookstore.presentation;

import com.capgemini.bookstore.entites.Book;
import com.capgemini.bookstore.exception.BookException;
import com.capgemini.bookstore.service.BookServiceImpl;
import com.capgemini.bookstore.service.IBookService;

public class BookClient {
	public static void main(String[] args) {
		int isbn[]= {2332,4656,76867};
		String name[]= {"java book", "oracle book","angular book"};
		float cost[]= {122,344,456};
		
		IBookService bookService = new BookServiceImpl();
		
		Book book[]=new Book[3];
		for(int i=0;i<book.length;i++) {
			book[i]= new Book(isbn[i],name[i],cost[i]);
			bookService.addBooktoKart(book[i]);
		}
		bookService.allBookDetail();
		
	try {
			bookService.searchBook(0);
		} catch (BookException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
	}

}

