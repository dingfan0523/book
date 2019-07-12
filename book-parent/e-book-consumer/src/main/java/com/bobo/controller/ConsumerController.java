package com.bobo.controller;

import com.bobo.pojo.User;
import com.bobo.service.ConsumerUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumerController {
    /* @Autowired
     private ConsumerOrdersService ordersService;
     @Autowired
     private ConsumerProductService productService;
     @Autowired
     private ConsumerTradeService tradeService;*/
    @Autowired
    private ConsumerUserService userService;

    @ApiOperation("创建订单")
    @GetMapping("/create")
    public List<String> createOrders() {
        this.login();
        return null;
    }

    private Integer login() {
        String userName = "admin";
        String password = "admin";
        User user = userService.login(userName, password);
        if (user != null) {
            System.out.println("登录成功");
        } else {
            System.out.println("账号名或密码错误");
        }
        return null;
    }
}
