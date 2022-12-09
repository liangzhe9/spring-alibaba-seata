package com.devin.spring.cloud.alibaba.business.controller;


import com.devin.spring.cloud.alibaba.provider.domain.TbOrder;
import com.devin.spring.cloud.alibaba.provider.domain.TbOrderItem;
import com.devin.spring.cloud.alibaba.provider.service.api.ProviderTransactionService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "transaction")
public class BusinessTransactionController {

    @Reference(version = "1.0.0")
    ProviderTransactionService providerTransactionService;

    @GetMapping(value = "create/order")
    public String createOrder() {
        TbOrder order = new TbOrder();
        order.setOrderId(1L);
        order.setUserId(2L);

        TbOrderItem orderItem = new TbOrderItem();
        orderItem.setUserId(2L);
        orderItem.setOrderId(1L);
        orderItem.setOrderItemId(1L);

        providerTransactionService.createOrder(order, orderItem);
        return "ok";
    }
}
