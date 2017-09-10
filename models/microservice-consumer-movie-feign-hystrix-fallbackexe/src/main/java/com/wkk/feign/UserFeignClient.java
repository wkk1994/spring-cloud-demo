package com.wkk.feign;

import com.wkk.entity.UserInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/9/6 0006.
 */
@FeignClient(name = "microservice-provider-user",fallbackFactory = UserClientFallbackFactory.class)
public interface UserFeignClient {
    @RequestMapping(value="/user/{id}",method = RequestMethod.GET)
    public UserInfo findById(@PathVariable("id") Long id);
}
