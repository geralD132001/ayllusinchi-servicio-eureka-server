package com.backend.springboot.app.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AyllusinchiServicioEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AyllusinchiServicioEurekaServerApplication.class, args);
    }

}
