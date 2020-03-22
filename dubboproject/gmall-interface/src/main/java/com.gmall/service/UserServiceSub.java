package com.gmall.service;

import com.gmall.bean.UserAddress;

import java.util.List;

/**
 * <p></p>
 *
 * @version 1.0 2020/03/19
 * @autuor zhangz
 */
public class UserServiceSub implements UserService{

    private UserService userService;

    public UserServiceSub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddress(String userId) {
        System.out.println("进入本地存根UserService");
        if(userId != null){
           return userService.getUserAddress(userId);
        }

        return null;
    }
}
