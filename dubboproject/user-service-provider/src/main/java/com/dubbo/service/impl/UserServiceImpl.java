package com.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.bean.UserAddress;
import com.gmall.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * <p></p>
 *
 * @version 1.0 2020/03/18
 * @autuor zhangz
 */
@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    @HystrixCommand
    public List<UserAddress> getUserAddress(String userId) {
        UserAddress user1= new UserAddress(1,"昌平","1","张三","1190111","1");
        UserAddress user2= new UserAddress(2,"石景山","2","李四","113390111","0");

        if(Math.random() > 0.5){
            throw new RuntimeException();
        }
        return Arrays.asList(user1,user2);
    }
}
