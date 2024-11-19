package com.example.jmg_project.rest.repository;

import com.example.jmg_project.rest.entity.PersonEntity;
import com.example.jmg_project.rest.entity.key.PersonEntityPK;
import com.example.jmg_project.rest.repository.querydsl.PersonCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity, PersonEntityPK>, PersonCustom {
}
