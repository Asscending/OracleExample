package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BookServiceImpl;
import com.example.demo.vo.BookVo;

@RestController
public class BookController {
	
	@Autowired
	BookServiceImpl bookService;
	
	@RequestMapping("/listBook")
	public List<BookVo> listBook() {
		return bookService.listBook();
	}

}
