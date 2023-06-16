package com.specs.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class Controller {
    @Autowired
    private ServiceImpl personService;


    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        return new ResponseEntity<>(personService.createPerson(person), HttpStatus.CREATED);
    }
    @GetMapping("/{name}/{surname}")
    public List<Person> getPersonsWith(@PathVariable String name, @PathVariable String surname) {
        return personService.getPersonsWith(name, surname);
    }

}
