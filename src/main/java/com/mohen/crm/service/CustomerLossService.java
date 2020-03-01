package com.mohen.crm.service;

import com.mohen.base.BaseService;
import com.mohen.crm.dao.CustomerLossMapper;
import com.mohen.crm.vo.CustomerLoss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerLossService extends BaseService<CustomerLoss,Integer> {

    @Autowired
    private CustomerLossMapper customerLossMapper;

    public CustomerLoss queryCustomerLossByCusNo(String cusNo){
        return customerLossMapper.queryCustomerLossByCusNo(cusNo);
    }
}
