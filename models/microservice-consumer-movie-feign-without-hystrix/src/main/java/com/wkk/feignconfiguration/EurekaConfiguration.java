package com.wkk.feignconfiguration;

import com.wkk.inter.ExcludeFromComponentScan;
import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by Administrator on 2017/9/5 0005.
 */
@Configuration
@ExcludeFromComponentScan
public class EurekaConfiguration {
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("user", "123456");
    }
    //禁用一个hystrix
    @Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }
}
