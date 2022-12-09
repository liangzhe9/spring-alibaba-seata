package com.devin.spring.cloud.alibaba.provider.service.impl;


import javax.annotation.Resource;
import com.devin.spring.cloud.alibaba.provider.mapper.TbOrderItemMapper;
import com.devin.spring.cloud.alibaba.provider.service.api.TbOrderItemService;
import com.devin.spring.cloud.alibaba.provider.domain.TbOrderItem;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class TbOrderItemServiceImpl implements TbOrderItemService{

    @Resource
    private TbOrderItemMapper tbOrderItemMapper;

    @Override
    public void insert(TbOrderItem item) {
        tbOrderItemMapper.insert(item);
    }
}
