package com.tracingSys.service;



import com.tracingSys.entity.Book;

import java.util.List;


public interface BookService
{

	void addBook(Book book);

	List<Book> getAllBooks();

	Book getBookById(int id);
	
	void deleteBook(int id);

	void deleteAllCache();

    long getBookCount();

    void updateBook(Book book);
}
