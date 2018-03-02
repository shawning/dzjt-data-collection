package com.dzjt.customer.controller;

import com.dzjt.customer.service.CustomerService;
import com.dzjt.timer.service.DailyTaskService;
import com.dzjt.timer.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/2/1 0001.
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private DailyTaskService dailyTaskService;

    @RequestMapping("/")
    String home() {
        return "index";
    }
    @RequestMapping("/uploadCustomerHistoryToZip")
    @ResponseBody
    public void getUserById() {
//        taskService.initTask();
        dailyTaskService.doDailyTask();
//        customerService.uploadCustomerHistoryToZip();
    }
}
