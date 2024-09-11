package com.kpl;


import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
public class DuplicateNameApplication {
    public static void main(String[] args) {
        SpringApplication.run(DuplicateNameApplication.class, args);

    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> {
            // This will print a message after the application has started
            System.out.println("Application started successfully. Access the app at: http://localhost:8088/");
        };
    }
}
