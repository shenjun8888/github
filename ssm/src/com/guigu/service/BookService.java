package com.guigu.service;

import java.util.List;

import com.guigu.pojo.Book;

public interface BookService {

	List<Book>  findAll()  throws Exception;

	boolean addBook(Book book)throws Exception;

	boolean deleteById(int id)throws Exception;

	Book findById(int id);
	
}
