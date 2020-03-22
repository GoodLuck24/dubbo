package com.dubbo.controller;

import com.gmall.bean.UserAddress;
import com.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p></p>
 *
 * @version 1.0 2020/03/18
 * @autuor zhangz
 */
@RestController
public class MyController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/getUser/{id}")
    public List<UserAddress> findList(@PathVariable("id") String id){
       return orderService.initOrder(id);
    }
}
