package com.wkk.controller;

import com.wkk.entity.UserInfo;
import com.wkk.fegin.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/9/5 0005.
 */
@RestController
public class MovieController {
    @Autowired
    private UserFeignClient userFeignClient;
    @GetMapping("movie/{id}")
    public UserInfo findUserInfoById(@PathVariable Long id){
        return userFeignClient.findById(id);
    }
}
