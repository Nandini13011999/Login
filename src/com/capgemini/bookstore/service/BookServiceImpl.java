package com.capgemini.bookstore.service;

import java.util.HashMap;
import java.util.Scanner;

import com.capgemini.bookstore.dao.BookDaoImpl;
import com.capgemini.bookstore.dao.IBookDao;
import com.capgemini.bookstore.entites.Book;
import com.capgemini.bookstore.exception.BookException;

public class BookServiceImpl implements IBookService {
	
	
	    Book book;
		IBookDao dao;//reference  of interface
		public BookServiceImpl() {
			dao=new BookDaoImpl();//object of class
		}

	@Override
	public void searchBook(int isbn) throws BookException {
		if(isbn<=0)
			throw new BookException("isbn can not be -ve or 0");
		else {
		book =null;
		book = new Book(isbn,null,0);
		if(dao.searchBook(book)==null)
			System.out.println("book is not present");
		else {
			System.out.println("book found");
			System.out.println(dao.searchBook(book));
		}
		}
	}

	Scanner sc=new Scanner(System.in);
	@Override
	public void addBooktoKart(Book book) {
		if(dao.addBook(book)) {
			
		/*System.out.println("How many book:");
			
			int qty = sc.nextInt();
			if(qty>1) {
				for (int i = 2; i <= qty; i++) {
					dao.addBook(book);
					
				}
			}
			*/
			System.out.println(" book added to kart");
			
		}
		else {
			System.out.println("book not avilable");
		}
		
	}

	@Override
	public void totalCost() {
		HashMap<Integer, Book> hashMap = dao.getAllBook();
		float cost=0;
		for (Integer i : hashMap.keySet())
		{
			Book b = hashMap.get(i);
			cost = cost+b.getCost();
			
		}
		int total = dao.getAllBook().size();
		System.out.println("Total book cost "+cost*total);
		
	}

	@Override
	public void removeBook(int isbn) throws BookException {
		
		if(isbn<=0)
			throw new BookException("isbn can not be -ve or 0");
		else
		{
		book = null;
		book = new Book(isbn,null,0);
		if(dao.deleteBook(book)) {
			System.out.println("book with isbn "+isbn+" is deleted");
		}
		else
			System.out.println("book not present");
		}	
	}

	@Override
	public void allBookDetail() {
		
		HashMap<Integer, Book> hashmap = dao.getAllBook();
		for(Integer i: hashmap.keySet())
		System.out.println(hashmap.get(i));
		
		
	}
	
	

}
