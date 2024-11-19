package com.example.jmg_project.rest.repository.querydsl;

import com.example.jmg_project.rest.model.PersonResult;

public interface PersonCustom {

    PersonResult personDetailList(Integer personId);
}
