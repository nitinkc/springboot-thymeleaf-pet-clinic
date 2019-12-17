package com.spring5.petclinic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingHelloWorld {
    int count = 0;
    @GetMapping("/")
    public String sayHello(){
        System.err.println(" Count = " + count++ + " ############ TESTING ###############");
        return "Spring Works Well!!";
    }
}
