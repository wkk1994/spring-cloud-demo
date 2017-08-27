package com.wkk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/8/26 0026.
 */
@SpringBootApplication
@EnableEurekaClient
public class MovieApp {
    @Bean
    //会根据方法名作为bean name
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args){
        SpringApplication.run(MovieApp.class,args);
    }
}
