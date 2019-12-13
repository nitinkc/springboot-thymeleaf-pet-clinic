package com.spring5.petclinic.repositories;

import com.spring5.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by nichaurasia on Thursday, December/12/2019 at 9:36 PM
 */

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
