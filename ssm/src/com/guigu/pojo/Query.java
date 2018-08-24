
package com.guigu.pojo;

import java.util.List;
import java.util.Map;

public class Query {
	
     private List<Book> bookList ;
     
     
     private Map<String, Object>  map;
     
	
	public Map<String, Object> getMap() {
		return map;
	}


	public void setMap(Map<String, Object> map) {
		this.map = map;
	}


	public List<Book> getBookList() {
		System.out.println("getBookList");
		return bookList;
	}
	

	public void setBookList(List<Book> bookList) {
		System.out.println("setBookList");
		this.bookList = bookList;
	}

}
