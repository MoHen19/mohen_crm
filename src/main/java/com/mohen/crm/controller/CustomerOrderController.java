package com.mohen.crm.controller;

import com.mohen.base.BaseController;
import com.mohen.crm.query.CustomerOrderQuery;
import com.mohen.crm.service.CustomerOrderService;
import com.mohen.crm.vo.CustomerOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping("order")
public class CustomerOrderController extends BaseController {

    @Resource
    private CustomerOrderService customerOrderService;

    @RequestMapping("list")
    @ResponseBody
    public Map<String,Object> queryCustomerOrdersByParams(CustomerOrderQuery customerOrderQuery){
        return customerOrderService.queryByParamsForDataGrid(customerOrderQuery);
    }

    @RequestMapping("queryOrderDetailByOrderId")
    @ResponseBody
    public Map<String,Object> queryOrderDetailByOrderId(Integer orderId){
        return customerOrderService.queryOrderDetailByOrderId(orderId);
    }
}
