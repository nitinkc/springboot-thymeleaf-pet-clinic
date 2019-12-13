package com.spring5.petclinic.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Compatible between h2 and MySQL
    private Long id;    //Recommendation of Hibernate to use Box Type

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
