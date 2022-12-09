package com.devin.spring.cloud.alibaba.provider.service.impl;

import com.devin.spring.cloud.alibaba.provider.domain.TbOrder;
import com.devin.spring.cloud.alibaba.provider.domain.TbOrderItem;
import com.devin.spring.cloud.alibaba.provider.service.api.ProviderTransactionService;
import com.devin.spring.cloud.alibaba.provider.service.api.TbOrderItemService;
import com.devin.spring.cloud.alibaba.provider.service.api.TbOrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class ProviderTransactionServiceImpl implements ProviderTransactionService {

    @Reference(version = "1.0.0")
    private TbOrderService tbOrderService;

    @Reference(version = "1.0.0")
    private TbOrderItemService TbOrderItemService;

    @Override
    @GlobalTransactional
    public void createOrder(TbOrder order, TbOrderItem item) {
        tbOrderService.insert(order);
        TbOrderItemService.insert(item);
        if (order.getUserId().equals(2L)) {
            throw new RuntimeException("seata has exception.");
        }
    }
}
