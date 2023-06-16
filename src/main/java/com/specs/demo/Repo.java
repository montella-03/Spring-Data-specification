package com.specs.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Person, Long>, JpaSpecificationExecutor<Person> {

}
