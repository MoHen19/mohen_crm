package com.mohen.crm.dao;

import com.mohen.base.BaseMapper;
import com.mohen.crm.vo.CustomerOrder;

import java.util.Map;

public interface CustomerOrderMapper extends BaseMapper<CustomerOrder,Integer> {

    public Map<String,Object> queryOrderDetailByOrderId(Integer orderId);

    public CustomerOrder queryLastCustomerOrderByCusId(Integer cusId);
}