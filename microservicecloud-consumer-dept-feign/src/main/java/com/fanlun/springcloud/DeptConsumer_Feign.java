package com.fanlun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.fanlun.springcloud"})
public class DeptConsumer_Feign {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_Feign.class, args);
    }
}
