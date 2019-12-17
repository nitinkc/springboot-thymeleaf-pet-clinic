package com.spring5.petclinic.controllers;

import com.spring5.petclinic.model.Owner;
import com.spring5.petclinic.services.OwnerService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/owners")
public class OwnersController {

    //Declaring final so that it cant be changes after constructor injection
    private final OwnerService ownerService;

    //Constructor Injection
    public OwnersController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/","/index","/index.html"})
    public String listOwners(Model model){
       model.addAttribute("owners",ownerService.findAll());
        return "owners/index";
    }

    @GetMapping(path="/all")
    public String getAllOwners(Model model){
        Set<Owner> set = ownerService.findAll();
        set.forEach(element -> System.out.println(element.getId()));
        model.addAllAttributes(set);

        return "all test";
    }
}
