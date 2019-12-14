package com.spring5.petclinic.repositories;

import com.spring5.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by nichaurasia on Thursday, December/12/2019 at 9:38 PM
 */

public interface VetRepository extends CrudRepository<Vet, Long> {
}
