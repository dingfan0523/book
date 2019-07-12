package com.bobo.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * 用户服务
 */
@FeignClient("e-book-user")
public interface ConsumerUserService extends UserService {
}
