package com.spring5.petclinic.services;

import com.spring5.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
