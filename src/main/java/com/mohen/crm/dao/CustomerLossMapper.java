package com.mohen.crm.dao;

import com.mohen.base.BaseMapper;
import com.mohen.crm.vo.CustomerLoss;

public interface CustomerLossMapper extends BaseMapper<CustomerLoss,Integer> {

    CustomerLoss queryCustomerLossByCusNo(String cusNo);
}