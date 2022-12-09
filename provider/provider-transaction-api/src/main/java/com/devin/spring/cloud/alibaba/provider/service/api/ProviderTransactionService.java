package com.devin.spring.cloud.alibaba.provider.service.api;

import com.devin.spring.cloud.alibaba.provider.domain.TbOrder;
import com.devin.spring.cloud.alibaba.provider.domain.TbOrderItem;

public interface ProviderTransactionService {

    public void createOrder(TbOrder order, TbOrderItem item);
}
