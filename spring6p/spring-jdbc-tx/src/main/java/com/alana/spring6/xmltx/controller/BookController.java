package com.alana.spring6.xmltx.controller;

import com.alana.spring6.xmltx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;
//    @Transactional()
    public void buyBook(Integer bookId ,Integer userId) throws InterruptedException {

//        TimeUnit.SECONDS.sleep(5);
        bookService.buyBook(bookId,userId);
    }
}
