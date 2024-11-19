package com.example.jmg_project.rest.controller.person;

import com.example.jmg_project.rest.model.PersonResult;
import com.example.jmg_project.rest.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.Parameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("")
public class PersonController {
    private final PersonService personService;

    @GetMapping(value = "/personDetail/{personId}")
    public ResponseEntity<PersonResult> personDetail(
        @RequestHeader Map<String, String> headers,
        @PathVariable("personId") Integer personId) {
        return new ResponseEntity<>(personService.personDetailList(personId), HttpStatus.OK);
    }
}
