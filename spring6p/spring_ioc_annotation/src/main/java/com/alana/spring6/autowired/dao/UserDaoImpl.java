package com.alana.spring6.autowired.dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class UserDaoImpl implements UserDao{

    @Override
    public void add(){
        System.out.println("add data");

    }
}
