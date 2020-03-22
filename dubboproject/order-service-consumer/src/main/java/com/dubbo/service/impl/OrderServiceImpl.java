package com.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gmall.bean.UserAddress;
import com.gmall.service.OrderService;
import com.gmall.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * <p></p>
 *
 * @version 1.0 2020/03/18
 * @autuor zhangz
 */
@Service
public class OrderServiceImpl implements OrderService{

    @Reference(check = false,stub = "com.gmall.service.UserServiceSub")
    //@Autowired
    private UserService userService;

    @Override
    @HystrixCommand(fallbackMethod = "orderBack")
    public List<UserAddress> initOrder(String userId) {
        List<UserAddress> userAddress = userService.getUserAddress(userId);

        return userAddress;
    }

    public List<UserAddress> orderBack(String userId) {
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);

        return Arrays.asList(userAddress);
    }
}
