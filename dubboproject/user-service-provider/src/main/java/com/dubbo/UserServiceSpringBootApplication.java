package com.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * <p></p>
 *
 * @version 1.0 2020/03/18
 * @autuor zhangz
 */
@EnableDubbo
@EnableHystrix
@SpringBootApplication
public class UserServiceSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceSpringBootApplication.class,args);
    }
}
