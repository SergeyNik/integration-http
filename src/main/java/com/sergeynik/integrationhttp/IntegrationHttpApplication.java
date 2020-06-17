package com.sergeynik.integrationhttp;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@RequiredArgsConstructor
@SpringBootApplication
@ImportResource("integration-context.xml")
public class IntegrationHttpApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntegrationHttpApplication.class, args);
    }
}
