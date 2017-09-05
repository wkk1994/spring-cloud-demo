package com.wkk.feign;

import com.wkk.entity.UserInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/8/31 0031.
 */
@FeignClient("microservice-provider-user")
public interface UserFeignClient {
    @RequestMapping(value="/user/{id}",method = RequestMethod.GET)
    public UserInfo getUserById(@PathVariable("id") Long id);// 两个坑：1. @GetMapping不支持   2. @PathVariable得设置value
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    boolean insertUser(UserInfo userInfo);
}
