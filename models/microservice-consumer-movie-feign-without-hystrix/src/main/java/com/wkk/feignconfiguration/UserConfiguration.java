package com.wkk.feignconfiguration;

import com.wkk.inter.ExcludeFromComponentScan;
import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/9/5 0005.
 */
@Configuration
@ExcludeFromComponentScan
public class UserConfiguration {
    @Bean//指定使用feign注解
    public Contract feignContract(){
        return new feign.Contract.Default();
    }
    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

}

