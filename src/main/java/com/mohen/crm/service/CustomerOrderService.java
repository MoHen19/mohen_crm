package com.mohen.crm.service;

import com.mohen.base.BaseService;
import com.mohen.crm.dao.CustomerOrderMapper;
import com.mohen.crm.vo.CustomerOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CustomerOrderService extends BaseService<CustomerOrder,Integer> {

    @Autowired
    private CustomerOrderMapper customerOrderMapper;

    public Map<String,Object> queryOrderDetailByOrderId(Integer orderId){
        return customerOrderMapper.queryOrderDetailByOrderId(orderId);
    }
}
