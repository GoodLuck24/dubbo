package com.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ImportResource;

/**
 * <p></p>
 *
 * @version 1.0 2020/03/18
 * @autuor zhangz
 */
//使用注解方式
@EnableDubbo
@EnableHystrix
//使用配置文件配置方式
//@ImportResource(locations = "classpath:consumer.xml")
@SpringBootApplication
public class OrderServiceSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceSpringBootApplication.class,args);
    }
}
