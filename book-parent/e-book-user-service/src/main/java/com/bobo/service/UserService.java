package com.bobo.service;

import com.bobo.pojo.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/user")
public interface UserService {

    @ApiOperation("登录")
    @GetMapping("/login")
    public User login(@RequestParam(value = "userName") @ApiParam("用户名") String userName,
                      @RequestParam(value = "password") @ApiParam("密码") String password);
}
