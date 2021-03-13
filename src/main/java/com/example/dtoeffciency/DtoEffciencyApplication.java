package com.example.dtoeffciency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DtoEffciencyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DtoEffciencyApplication.class, args);
    }

}
