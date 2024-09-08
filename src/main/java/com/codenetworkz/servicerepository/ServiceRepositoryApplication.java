package com.codenetworkz.servicerepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceRepositoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRepositoryApplication.class, args);
    }

}
