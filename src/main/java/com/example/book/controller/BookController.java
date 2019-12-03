package com.example.book.controller;

import com.example.book.service.BookService;
import com.example.book.vo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("findAll")
    protected Book findById(){

        return  bookService.findAll();
    }
}
