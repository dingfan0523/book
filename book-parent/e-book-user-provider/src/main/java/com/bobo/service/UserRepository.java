package com.bobo.service;

import com.bobo.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByUserNameAndPassword(String userName, String password);
}
