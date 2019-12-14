package com.spring5.petclinic.repositories;

import com.spring5.petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by nichaurasia on Thursday, December/12/2019 at 9:37 PM
 */

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
