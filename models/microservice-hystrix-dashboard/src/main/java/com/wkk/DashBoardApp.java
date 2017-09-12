package com.wkk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by Administrator on 2017/9/10 0010.
 */
@EnableHystrixDashboard
@SpringBootApplication
public class DashBoardApp {
    public static void main(String[] args){
        SpringApplication.run(DashBoardApp.class,args);
    }
}
