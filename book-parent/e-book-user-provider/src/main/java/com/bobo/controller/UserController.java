package com.bobo.controller;

import com.bobo.pojo.User;
import com.bobo.service.UserService;
import com.bobo.service.UserServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserService {
    @Autowired
    private UserServiceImpl userService;

    @Override
    public User login(String userName, String password) {
        return userService.login(userName, password);
    }
}
