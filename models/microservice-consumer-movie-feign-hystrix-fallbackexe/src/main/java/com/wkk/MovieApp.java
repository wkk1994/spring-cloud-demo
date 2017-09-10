package com.wkk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by Administrator on 2017/9/6 0006.
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class MovieApp {
    public static void main(String[] args){
        SpringApplication.run(MovieApp.class,args);
    }
}
