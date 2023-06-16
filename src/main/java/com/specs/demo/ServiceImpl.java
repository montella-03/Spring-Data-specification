package com.specs.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceImpl {
    Person createPerson(Person person);
    Person getPerson(Long id);
    Person updatePerson(Long id, String name, String surname, int age);
    void deletePerson(Long id);
    List<Person> getPersonsWith(String name, String surname);

}
