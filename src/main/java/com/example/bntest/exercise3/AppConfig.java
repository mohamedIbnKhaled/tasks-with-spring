package com.example.bntest.exercise3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Employ emp(){
        return new  Employ();
    }
}
