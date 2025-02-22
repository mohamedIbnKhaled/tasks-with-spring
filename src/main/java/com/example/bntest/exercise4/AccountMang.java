package com.example.bntest.exercise4;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class AccountMang {

    public void createAcc(String name){
        System.out.println("acc name is = " + name);
    }
}
