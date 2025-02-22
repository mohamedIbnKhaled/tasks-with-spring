package com.example.bntest.exercise4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
    @Bean()
    public AccountMang accountMang(){
        return new AccountMang();
    }
}
