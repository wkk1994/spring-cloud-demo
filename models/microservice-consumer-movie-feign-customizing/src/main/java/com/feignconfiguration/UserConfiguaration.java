package com.feignconfiguration;

import feign.Contract;
import feign.Logger;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/8/31 0031.
 */
@Configuration
public class UserConfiguaration {
    @Bean //指定使用feign注解
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
