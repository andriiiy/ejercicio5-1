package com.bosonit.ej51spring.controllers;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MessageController {

    @PostConstruct
    public void PostConstruct (){
        System.out.println("Hola desde clase inicial");
    }

    @Bean("bean1")
    public String controller1 (){
        return "Hola desde clase secundaria";
    }

    @Bean("bean2")
    public String controller2 (){
        return "Soy la tercera clase";
    }

}