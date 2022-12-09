package dev.marcusi.h2person.repository;

import dev.marcusi.h2person.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Book;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
