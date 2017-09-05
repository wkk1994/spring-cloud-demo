package com.wkk.controller;

import com.wkk.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * Created by Administrator on 2017/9/5 0005.
 */
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/movie/{id}")
    @HystrixCommand(fallbackMethod = "findById")
    public UserInfo findUserInfoById(@PathVariable Long id){
        System.out.println("==========进入findUserInfoById");
        return this.restTemplate.getForObject("http://microservice-provider-user/user/" + id, UserInfo.class);
    }

    public UserInfo findById(Long id){
        System.out.println("==========进入findById");
        UserInfo user  = new UserInfo();
        user.setId(1L);
        return user;
    }
}
