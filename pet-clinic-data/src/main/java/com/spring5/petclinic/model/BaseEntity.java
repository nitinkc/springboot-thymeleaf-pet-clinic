package com.spring5.petclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    //Recommendation of Hibernate to use Box Type
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
