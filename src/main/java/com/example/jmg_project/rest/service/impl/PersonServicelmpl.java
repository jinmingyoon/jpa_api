package com.example.jmg_project.rest.service.impl;

import com.example.jmg_project.rest.model.PersonResult;
import com.example.jmg_project.rest.repository.PersonRepository;
import com.example.jmg_project.rest.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class PersonServicelmpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public PersonResult personDetailList(Integer personId) {
        return personRepository.personDetailList(personId);
    }
}
