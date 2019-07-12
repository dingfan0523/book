package com.bobo.service;

import com.bobo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserServiceImpl {
    @Autowired
    private UserRepository userMapper;

    /**
     * 账号登录
     *
     * @param userName
     * @param password
     * @return
     */
    public User login(String userName, String password) {
        if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
            System.out.println("账号密码不能为空");
        }
        return userMapper.findByUserNameAndPassword(userName, password);
    }
}
