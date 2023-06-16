package com.specs.demo;

import org.springframework.data.jpa.domain.Specification;

public class PersonSpecification {
    public static Specification<Person> hasName(String name) {
        return (person, cq, cb) -> cb.equal(person.get("name"), name);
    }
    public static Specification<Person> hasSurname(String surname) {
        return (person, cq, cb) -> cb.equal(person.get("surname"), surname);
    }
    public static Specification<Person> hasAge(int age) {
        return (person, cq, cb) -> cb.equal(person.get("age"), age);
    }
    public static Specification<Person> hasNameAndSurname(String name, String surname) {
        return Specification.where(hasName(name)).and(hasSurname(surname));
    }
}
