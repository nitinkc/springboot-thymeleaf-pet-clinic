package com.spring5.petclinic.repositories;

import com.spring5.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by nichaurasia on Thursday, December/12/2019 at 9:33 PM
 */

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
