package com.alana.spring6.iocxml.bean;

import com.alana.spring6.iocxml.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {
    @Test
    public void test(){
        ApplicationContext context = new  ClassPathXmlApplicationContext("bean.xml");
        UserDao userDao = context.getBean(UserDao.class);
//        UserDaoImpl userDao1 = context.getBean(UserDao.class);
        System.out.println(userDao);
        userDao.run();
    }
}
