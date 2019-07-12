package com.bobo.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * 商品服务
 */
@FeignClient("e-book-product")
public interface ConsumerProductService extends ProductService{
}
