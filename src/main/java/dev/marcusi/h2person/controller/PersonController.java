package dev.marcusi.h2person.controller;

import dev.marcusi.h2person.model.Person;
import dev.marcusi.h2person.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    private final PersonRepository repository;

    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Person> findAll() {
        return repository.findAll();
    }
}
