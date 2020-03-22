package com.gmall.service;

import com.gmall.bean.UserAddress;

import java.util.List;

/**
 * <p></p>
 *
 * @version 1.0 2020/03/18
 * @autuor zhangz
 */
public interface OrderService {

    public List<UserAddress> initOrder(String userId);
}
