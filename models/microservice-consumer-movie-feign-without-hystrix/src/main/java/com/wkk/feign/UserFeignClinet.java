package com.wkk.feign;

import com.wkk.entity.UserInfo;
import com.wkk.feignconfiguration.UserConfiguration;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by Administrator on 2017/9/5 0005.
 */
@FeignClient(name = "microservice-provider-user",configuration = UserConfiguration.class,fallback = UserFallback.class)
public interface UserFeignClinet {
    @RequestLine("GET /user/{id}")
    public UserInfo findById(@Param("id") Long id);
}
