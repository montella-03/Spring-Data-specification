package com.specs.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements ServiceImpl {
    @Autowired
    private  Repo repo;
    @Override
        public Person createPerson(Person person) {
            repo.save(person);
            return person;
        }

        public Person getPerson(Long id) {
            return repo.findById(id).orElseThrow();
        }

        public Person updatePerson(Long id, String name, String surname, int age) {
            Person person = repo.findById(id).orElseThrow();
            person.setName(name);
            person.setSurname(surname);
            person.setAge(age);
            return repo.save(person);
        }
@Override
        public void deletePerson(Long id) {
            repo.deleteById(id);
        }
        @Override
        public List<Person> getPersonsWith(String name, String surname) {
            Specification<Person> spec = Specification.where(PersonSpecification.hasName(name)).and(PersonSpecification.hasSurname(surname));
            List<Person> personList= repo.findAll(spec);
            return personList;
        }


}
