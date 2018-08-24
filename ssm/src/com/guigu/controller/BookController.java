package com.guigu.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.test.annotation.DirtiesContext.MethodMode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.guigu.pojo.Book;
import com.guigu.pojo.BookVo;
import com.guigu.service.BookService;

@Controller
@RequestMapping(value="/BookController")
public class BookController {
	@Resource
	private BookService bookService;
	
	
	public BookController() {
		System.out.println("BookController 实例化");
	}
	
	@RequestMapping(value="/findAllBook.action",method= {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView findAllBook() {
		ModelAndView  modelAndView = new ModelAndView();
		try {
			List<Book>  list = bookService.findAll();
			modelAndView.addObject("bookList",list);
			modelAndView.setViewName("bookList");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelAndView;
	}
	
	@RequestMapping(value="/addBook.action",method=RequestMethod.POST)
	public ModelAndView addBook(HttpServletRequest  request,HttpServletResponse  response) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		ModelAndView  modelAndView = new ModelAndView();
		Book  book = new Book();
		book.setAuthor(request.getParameter("author"));
		book.setPrice(Double.parseDouble(request.getParameter("price")));
		book.setName(request.getParameter("name"));
		try {
			boolean result = bookService.addBook(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		modelAndView.setViewName("ok");
		
		
		return modelAndView;
	}
	
	@RequestMapping(value="/findById.action")
	public  String getBook(@RequestParam("id")int value,HttpServletRequest  request) {
		System.out.println("id:"+value);
		
		Book  book =  bookService.findById(value);
		
		request.setAttribute("book", book);
		return "bookInfo";
	}
	
	
	@RequestMapping(value="/addBookByPojo.action")
	public String addBookPojo( Book book,HttpServletRequest  request) throws Exception {
		request.setCharacterEncoding("UTF-8");
		System.out.println(book);
         bookService.addBook(book);
		return "redirect:findAllBook.action";
	}
	
	
	@RequestMapping("/addBookByPojoVo.action")
	public String addBookByPojoVo(BookVo bookVo) {
		System.out.println(bookVo.getBook());
		return "redirect:findAllBook.action";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
