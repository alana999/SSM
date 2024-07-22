package com.alana.spring6.autowired.controller;

import com.alana.spring6.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    public void add(){
        System.out.println("controller");
        userService.add();
    }
}
