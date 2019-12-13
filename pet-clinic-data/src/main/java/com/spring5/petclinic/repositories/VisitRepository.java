package com.spring5.petclinic.repositories;

import com.spring5.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by nichaurasia on Thursday, December/12/2019 at 9:39 PM
 */

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
