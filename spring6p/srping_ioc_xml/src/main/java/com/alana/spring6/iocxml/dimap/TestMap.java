package com.alana.spring6.iocxml.dimap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMap {
    public static void main(String[] args) {

        ApplicationContext context = new  ClassPathXmlApplicationContext("bean.dimap.xml");

        Stu stu = context.getBean("stu", Stu.class);

        stu.run();

    }
}
