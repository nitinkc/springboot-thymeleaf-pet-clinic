package com.spring5.petclinic.services.springDataJPA;

import com.spring5.petclinic.model.Owner;
import com.spring5.petclinic.repositories.OwnerRepository;
import com.spring5.petclinic.repositories.PetRepository;
import com.spring5.petclinic.repositories.PetTypeRepository;
import com.spring5.petclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Created by nichaurasia on Thursday, December/12/2019 at 9:55 PM
 */

@Service
//Allowing the MAP Implementation to take effect until the development is done.
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService  {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
                             PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }


    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Owner findById(Long aLong) {
        Optional<Owner> ownerOptional = ownerRepository.findById(aLong);
        //Replacing with a single expression in Functional Style
        return ownerOptional.orElse(null);

        //CLEANER
        //return ownerRepository.findById(aLong).orElse(null);

        //OLD SCHOOL
        /* if(ownerOptional.isPresent()){
            return ownerOptional.get();
        }else {
            return null;
        }*/
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();

        ownerRepository.findAll().forEach(owners ::add);
        return owners;
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }
}
