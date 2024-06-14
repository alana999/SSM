package com.alana.spring6.iocxml.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
//    @Test
//    public void testSetter(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.di.xml");
//        Book book = (Book) context.getBean("book");
//        System.out.println(book);
//    }

    @Test
    public void testSetter(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.di.xml");
        Book book = (Book) context.getBean("bookcon");
        System.out.println(book);
    }
}
