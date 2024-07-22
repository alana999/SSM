package com.alana.spring6.autowired.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testauto {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        UserController userController = applicationContext.getBean(UserController.class);
        userController.add();
    }
}
