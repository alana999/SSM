package com.alana.spring6.autowired.service;

import com.alana.spring6.autowired.dao.UserDao;
import jdk.jfr.DataAmount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class UserSerivceImpl implements UserService{
    @Autowired
    UserDao userDao;

    @Override
    public void add(){
        System.out.println("service____________");
        userDao.add();
    }
}
