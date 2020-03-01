package com.mohen.crm.task;

import com.mohen.crm.service.CustomerService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author MH19
 */
@Service
public class TaskService {

    @Resource
    private CustomerService customerService;
   /*
    每两秒执行一次
    @Scheduled(cron = "0/2 * * * * ?")

    每月最后一天23点执行任务
    @Scheduled(cron = "0 0 23 L * ?")
    */

    public void job(){
        System.out.println("定时任务开始执行-->"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        customerService.updateCustomerState();
    }
}
