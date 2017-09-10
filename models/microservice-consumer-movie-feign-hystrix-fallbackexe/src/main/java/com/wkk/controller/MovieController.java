package com.wkk.controller;

import com.wkk.entity.UserInfo;
import com.wkk.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/6 0006.
 */
@RestController
public class MovieController {
    @Autowired
    private UserFeignClient userFeignClient;
    @GetMapping("/movie/{id}")
    public UserInfo findUserInfoById(@PathVariable("id") Long id){
        return userFeignClient.findById(id);
    }
}
