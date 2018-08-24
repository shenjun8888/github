package com.guigu.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.pojo.Book;
import com.guigu.pojo.Query;

@Controller
@RequestMapping("/test")
public class TestParamController {
	
	


	@RequestMapping("/testArr.action")
	public String testArr(String[] ids) {
		for (String string : ids) {
			System.out.println(string);
		}
		return null;
	}
	
	@RequestMapping("/testList.action")
	public String testList(Query query) {
	     for (Book book : query.getBookList()) {
			System.out.println(book);
		}
		return null;
	}
	
	@RequestMapping("/testMap.action")
	public String testMap(Query query) {
		Map<String, Object> map = query.getMap();
		map.forEach((k,v)->{
			System.out.println(k+"   "+v);
		});
		return null;
	}

}
