package com.wkk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by Administrator on 2017/9/10 0010.
 */
@SpringBootApplication
@EnableTurbine
public class TurbineApp {
    public static void main(String[] args){
        SpringApplication.run(TurbineApp.class,args);
    }
}
