package com.ivoronline.springboot_db_query_jpql_projection_dto_manual.repositories;

import com.ivoronline.springboot_db_query_jpql_projection_dto_manual.entities.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
  @Query(value = "SELECT person.name, person.age FROM Person person WHERE person.name = 'John'")
  Object selectPerson();
}
