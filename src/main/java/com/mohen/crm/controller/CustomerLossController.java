package com.mohen.crm.controller;

import com.mohen.base.BaseController;
import com.mohen.crm.query.CustomerLossQuery;
import com.mohen.crm.service.CustomerLossService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping("customer_loss")
public class CustomerLossController extends BaseController {
    @Resource
    private CustomerLossService customerLossService;


    @RequestMapping("index")
    private String index(){
        return "customer_loss";
    }

    @RequestMapping("list")
    @ResponseBody
    public Map<String,Object> queryCustomerLossByParams(CustomerLossQuery customerLossQuery){
        return customerLossService.queryByParamsForDataGrid(customerLossQuery);
    }
}