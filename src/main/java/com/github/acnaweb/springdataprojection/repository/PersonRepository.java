package com.github.acnaweb.springdataprojection.repository;

import com.github.acnaweb.springdataprojection.model.Person;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

	<T> List<T> findBy(Class<T> type);

}
