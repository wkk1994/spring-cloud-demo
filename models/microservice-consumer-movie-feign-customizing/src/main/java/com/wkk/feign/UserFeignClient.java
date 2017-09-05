package com.wkk.feign;

import com.feignconfiguration.UserConfiguaration;
import com.wkk.entity.UserInfo;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/8/31 0031.
 */
@FeignClient(name = "microservice-provider-user", configuration = UserConfiguaration.class)
public interface UserFeignClient {
    @RequestLine("GET /user/{id}")
    public UserInfo getUserById(@Param("id") Long id);
}
