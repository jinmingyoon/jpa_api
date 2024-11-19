package com.example.jmg_project.rest.entity.key;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class PersonEntityPK implements Serializable {
    @Column(name = "PERSON_ID")
    @Id
    private Integer personId;
}
