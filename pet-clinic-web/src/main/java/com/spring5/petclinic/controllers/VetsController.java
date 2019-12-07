package com.spring5.petclinic.controllers;

import com.spring5.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetsController {

    private final VetService vetService;

    public VetsController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/","/index","/index.html"})
    public String listVets(Model model){
        model.addAttribute("vets", vetService.findAll());
        return "Vets/index";
    }
}
