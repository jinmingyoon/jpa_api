package com.example.jmg_project.rest.entity;

import com.example.jmg_project.rest.entity.key.PersonEntityPK;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "person", schema = "", catalog = "")
@IdClass(PersonEntityPK.class)
public class PersonEntity extends BaseEntity{
    @Id
    @Column(name = "PERSON_ID")
    private Integer personId;

    @Basic
    @Column(name = "PERSON_NM")
    private String personNm;

    @Basic
    @Column(name = "USE_YN")
    private String useYn;

}
