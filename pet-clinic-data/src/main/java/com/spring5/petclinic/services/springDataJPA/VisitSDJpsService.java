package com.spring5.petclinic.services.springDataJPA;

import com.spring5.petclinic.model.Visit;
import com.spring5.petclinic.repositories.VisitRepository;
import com.spring5.petclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nichaurasia on Friday, December/13/2019 at 8:50 PM
 */

@Service
@Profile("springdatajpa")
public class VisitSDJpsService implements VisitService {
    private final VisitRepository visitRepository;

    public VisitSDJpsService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}