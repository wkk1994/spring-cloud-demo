package com.wkk.controller;

import com.wkk.entity.UserInfo;
import com.wkk.feign.EurekaFeignClient;
import com.wkk.feign.UserFeignClinet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/5 0005.
 */
@RestController
public class MovieController {
    @Autowired
    private EurekaFeignClient eurekaFeignClient;
    @Autowired
    private UserFeignClinet userFeignClinet;
    @GetMapping("/movie/{id}")
    public UserInfo findUserInfoById(@PathVariable Long id){
        System.out.println("========normal");
        return userFeignClinet.findById(id);
    }
    @GetMapping("/movie/eureka/{serviceName}")
    public String getServiceInfo(@PathVariable String serviceName){
        System.out.println("========normal");
        return eurekaFeignClient.getServiceInfo(serviceName);
    }
}
