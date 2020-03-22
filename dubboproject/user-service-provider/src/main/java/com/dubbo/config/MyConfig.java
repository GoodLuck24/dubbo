package com.dubbo.config;

import com.alibaba.dubbo.config.*;
import com.gmall.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * <p>API配置方式</p>
 *
 * @version 1.0 2020/03/19
 * @autuor zhangz
 */
//@Configuration
public class MyConfig {

    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("user-service-provider");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("127.0.0.1:2181");
        registryConfig.setProtocol("zookeeper");
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20890);
        return protocolConfig;
    }

    @Bean
    public ServiceConfig<UserService> serviceConfig(UserService userService){
        ServiceConfig serviceConfig = new ServiceConfig();
        serviceConfig.setRef(userService);
        serviceConfig.setTimeout(1000);

        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("getUserAddress");

        serviceConfig.setMethods(Arrays.asList(methodConfig));

        return serviceConfig;
    }
}
