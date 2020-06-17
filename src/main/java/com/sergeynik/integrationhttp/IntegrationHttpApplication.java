package com.sergeynik.integrationhttp;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@RequiredArgsConstructor
@SpringBootApplication
@Configuration
@ImportResource("integration-context.xml")
public class IntegrationHttpApplication implements ApplicationRunner {

    private final CustomGateway gateway;

    public static void main(String[] args) {
        SpringApplication.run(IntegrationHttpApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {
        gateway.print("Hello World");
    }
}
