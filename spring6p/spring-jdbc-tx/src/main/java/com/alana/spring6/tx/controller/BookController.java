package com.alana.spring6.tx.controller;

import com.alana.spring6.tx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @Transactional()
    public void buyBook(Integer bookId ,Integer userId) throws InterruptedException {

//        TimeUnit.SECONDS.sleep(5);
        bookService.buyBook(bookId,userId);
    }
}
