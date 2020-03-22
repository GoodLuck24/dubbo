package com.dubbo;

import com.gmall.bean.UserAddress;
import com.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * <p></p>
 *
 * @version 1.0 2020/03/18
 * @autuor zhangz
 */
public class MyApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        OrderService orderService = context.getBean(OrderService.class);
        List<UserAddress> list = orderService.initOrder("1");
        System.out.println(list);

        System.in.read();
    }
}
