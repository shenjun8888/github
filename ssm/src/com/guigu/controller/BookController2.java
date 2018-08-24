package com.guigu.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.guigu.pojo.Book;
import com.guigu.service.BookService;

@Controller
@RequestMapping(value="/BookController2")
public class BookController2 {
	
	//需要将业务逻辑层注入
	@Resource
	private BookService  bookService;
	
	@RequestMapping(value="/deleteById.action")
	public ModelAndView deleteById(HttpServletRequest  request,HttpServletResponse  response) {
		String idStr = request.getParameter("id");
		int id = Integer.parseInt(idStr);
		
		try {
			boolean result = bookService.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("ok");
		return modelAndView;//默认的跳转就是一个请求转发
	}
	
	
	//返回String类型的字符串  表示的是请求转发的页面
	@RequestMapping(value="/findAll.action")
	public String findAll(HttpServletRequest  request,HttpServletResponse  response) {
		try {
			List<Book> list = bookService.findAll();
			request.setAttribute("bookList", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "bookList";//默认也是进行的请求转发
	}
	
	
	
	@RequestMapping(value="/deleteById2.action")
	public String deleteById2(HttpServletRequest  request,HttpServletResponse  response) {
		String idStr = request.getParameter("id");
		int id = Integer.parseInt(idStr);
		
		try {
			boolean result = bookService.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*return "redirect:/BookController/findAllBook.action";//默认的跳转就是一个请求转发
*/	return "forward:findAll.action";//请求转发
		
	}

}
