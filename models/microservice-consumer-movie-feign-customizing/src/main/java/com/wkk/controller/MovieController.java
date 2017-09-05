package com.wkk.controller;

import com.wkk.entity.UserInfo;
import com.wkk.feign.EurekaFeignClient;
import com.wkk.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/8/26 0026.
 */
@RestController
public class MovieController {
    @Autowired
    private UserFeignClient userFeignClient;
    @Autowired
    private EurekaFeignClient eurekaFeignClient;
    @GetMapping("/movie/{id}")
    public UserInfo findUserInfoById(@PathVariable Long id){
        return userFeignClient.getUserById(id);
    }
    @GetMapping("/movie/eureka/{serviceName}")
    public String eurekaServiceInfo(@PathVariable("serviceName") String serviceName){
        return eurekaFeignClient.getServiceInfo(serviceName);
    }
}
