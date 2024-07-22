package com.alana.spring6.iocxml.auto;

import com.alana.spring6.iocxml.auto.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.security.PublicKey;

public class TestAuto {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-auto.xml");

        UserController controller = context.getBean("controller", UserController.class);

        controller.add();
    }
}
