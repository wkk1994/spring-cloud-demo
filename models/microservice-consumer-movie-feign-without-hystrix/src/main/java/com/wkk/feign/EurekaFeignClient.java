package com.wkk.feign;

import com.wkk.feignconfiguration.EurekaConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/9/5 0005.
 */
@FeignClient(name = "eureka",url = "http://localhost:8079",configuration = EurekaConfiguration.class,fallback = EurekaFallback.class)
public interface EurekaFeignClient {
    @RequestMapping("/eureka/apps/{serviceName}")
    public String getServiceInfo(@PathVariable("serviceName") String serviceName);
}
@Component
class EurekaFallback implements EurekaFeignClient {

    @Override
    public String getServiceInfo(@PathVariable("serviceName") String serviceName) {
        System.out.println("=========Fallback");
        return "haha";
    }
}
