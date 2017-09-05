package com.wkk;

import com.wkk.config.ExcludeFromComponentScan;
import com.wkk.config.TestConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "microservice-provider-user", configuration = TestConfiguration.class)
//防止rule共享
//@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = ExcludeFromComponentScan.class)})
public class MovieApp {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(MovieApp.class, args);
    }
}
