package com.wkk.controller;

import com.wkk.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/8/26 0026.
 */
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${user.userServicePath}")
    private String userServicePath;
    @GetMapping("/movie/{id}")
    public UserInfo findUserInfoById(@PathVariable Long id){
        return this.restTemplate.getForObject(this.userServicePath + id, UserInfo.class);
    }
}
