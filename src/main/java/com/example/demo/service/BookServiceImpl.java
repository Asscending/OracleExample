package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookDao;
import com.example.demo.vo.BookVo;

@Service
@Repository
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao bookDao;
	
	public List<BookVo> listBook(){
		List<BookVo> list = bookDao.listBook();
		return list;
	}

}
