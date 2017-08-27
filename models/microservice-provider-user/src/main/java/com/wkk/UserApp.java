package com.wkk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Administrator on 2017/8/26 0026.
 */
@SpringBootApplication
@EnableEurekaClient
public class UserApp {
    public static void main(String[] args){
        SpringApplication.run(UserApp.class,args);
    }
}
