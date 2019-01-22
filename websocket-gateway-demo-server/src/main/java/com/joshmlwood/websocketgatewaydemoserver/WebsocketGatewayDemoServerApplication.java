package com.joshmlwood.websocketgatewaydemoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableDiscoveryClient
@SpringBootApplication
public class WebsocketGatewayDemoServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsocketGatewayDemoServerApplication.class, args);
    }

}

