
package com.bobo.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * 服务
 */

@FeignClient("e-book-trade")
public interface ConsumerTradeService extends TradeService{
}

