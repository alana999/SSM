package com.alana.spring6.iocxml.auto.controller;

import com.alana.spring6.iocxml.auto.service.UserService;
import com.alana.spring6.iocxml.auto.service.UserServiceImpl;

public class UserController {
    private UserService userService;
//    private UserServiceImpl  userServiceImpl= new UserServiceImpl();

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void add(){
        System.out.println("controller....................");
        userService.addUserService();
//        userServiceImpl.addUserService();
    }
}
