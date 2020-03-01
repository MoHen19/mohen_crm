package com.mohen.crm.dao;

import com.mohen.base.BaseMapper;
import com.mohen.crm.vo.Customer;

import java.util.List;

public interface CustomerMapper extends BaseMapper<Customer,Integer> {

    Customer queryCustomerByName(String name);

    public List<Customer> queryLossCustomers();

    int updateCustomerStateByIds(List<Integer> lossCusIds);
}