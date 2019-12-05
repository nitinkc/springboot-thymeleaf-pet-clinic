package com.spring5.petclinic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingHelloWorld {
    @GetMapping("/")
    public String sayHello(){
        return "Spring Works Well!!";
    }
}
