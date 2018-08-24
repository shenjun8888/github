package com.guigu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.mapper.BookMapper;
import com.guigu.pojo.Book;
import com.guigu.pojo.BookExample;
import com.guigu.service.BookService;
@Service
public class BookServiceImpl implements  BookService{
	@Resource
	private BookMapper bookMapper;

	@Override
	public List<Book> findAll() throws Exception {
		BookExample example = new BookExample();
		example.setOrderByClause("price");
		return bookMapper.selectByExample(example);
	}

	@Override
	public boolean addBook(Book book) throws Exception {
		
		return bookMapper.insertSelective(book) > 0;
	}

	@Override
	public boolean deleteById(int id) throws Exception {
		return bookMapper.deleteByPrimaryKey(id) > 0;
	}

	@Override
	public Book findById(int id) {
		return bookMapper.selectByPrimaryKey(id);
	}
	
	

}
