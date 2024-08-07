package com.alana.spring6.iocxml.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbc {
//    @Test
//    public void demo1(){
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setUrl();
//        dataSource.setUsername();
//        dataSource.setDriver();
//    }
    @Test
    public void demo2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-jdbc.xml");


        DruidDataSource dataSource = context.getBean(DruidDataSource.class);
        System.out.println(dataSource.getUrl());
    }
}
