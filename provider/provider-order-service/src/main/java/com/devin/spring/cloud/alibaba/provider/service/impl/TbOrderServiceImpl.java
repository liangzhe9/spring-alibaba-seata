package com.devin.spring.cloud.alibaba.provider.service.impl;


import javax.annotation.Resource;


import com.devin.spring.cloud.alibaba.provider.domain.TbOrder;
import com.devin.spring.cloud.alibaba.provider.mapper.TbOrderMapper;
import com.devin.spring.cloud.alibaba.provider.service.api.TbOrderService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class TbOrderServiceImpl implements TbOrderService{

    @Resource
    private TbOrderMapper tbOrderMapper;

    @Override
    public void insert(TbOrder order) {
        tbOrderMapper.insert(order);
    }
}
