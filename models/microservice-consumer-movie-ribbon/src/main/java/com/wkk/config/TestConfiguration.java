package com.wkk.config;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/8/28 0028.
 */
@Configuration
@ExcludeFromComponentScan
public class TestConfiguration {
    //@Autowired
    //IClientConfig config;
    //指定ribbon负载均衡规则
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}
