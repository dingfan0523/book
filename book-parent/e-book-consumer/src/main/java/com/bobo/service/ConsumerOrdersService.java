package com.bobo.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * 订单服务
 */
@FeignClient("e-book-service")
public interface ConsumerOrdersService extends OrdersService {
}
