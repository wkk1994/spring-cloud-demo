package com.wkk.feign;

import com.feignconfiguration.EurekaConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/8/31 0031.
 */
@FeignClient(name="eureka",url = "http://localhost:8079",configuration = EurekaConfiguration.class)
public interface EurekaFeignClient {
    @RequestMapping("/eureka/apps/{serviceName}")
    public String getServiceInfo(@PathVariable("serviceName") String serviceName);
}
