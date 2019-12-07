package com.spring5.petclinic.bootstrap;

import com.spring5.petclinic.model.Owner;
import com.spring5.petclinic.model.Vet;
import com.spring5.petclinic.services.OwnerService;
import com.spring5.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    //Injecting via constructor. no need for @Autowire
    public DataLoader(OwnerService ownerService, VetService vetService){
        this.ownerService = ownerService;
        this.vetService = vetService;
    }
    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("John");
        owner1.setLastName("Doe");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Jenney");
        owner2.setLastName("Doe");

        ownerService.save(owner2);
        System.out.println("Owners Loaded....");

        Vet vet1 = new Vet();
        vet1.setId(100L);
        vet1.setFirstName("Xmen");
        vet1.setLastName("Last");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(200L);
        vet2.setFirstName("Total");
        vet2.setLastName("Recall");

        vetService.save(vet2);

        System.out.println("Vets Loaded...");
    }
}
