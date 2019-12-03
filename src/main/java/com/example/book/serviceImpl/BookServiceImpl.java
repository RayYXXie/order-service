package com.example.book.serviceImpl;

import com.example.book.service.BookService;
import com.example.book.vo.Book;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Override
    public Book findAll() {

        Book book = new Book("微服务",28);
        return book;
    }
}
