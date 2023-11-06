package com.mah312.springinaction.department;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/{id}")
    public Person fetchPersonById(@PathVariable("id") Long id) {
        return personService.fetchPersonById(id);
    }

    @GetMapping("/fetchAll")
    public List<Person> fetchAllPersons() {
        return personService.fetchAllPersons();
    }

    @PostMapping
    public Person savePerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }

    @PutMapping("/{id}")
    public Person updatPerson(@RequestBody Person person, @PathVariable("id") Long id) {
        return personService.updatePerson(person, id);
    }
}
