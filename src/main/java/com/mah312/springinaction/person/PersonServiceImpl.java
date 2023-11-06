package com.mah312.springinaction.person;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PersonServiceImpl implements PersonService {


//    @Autowired
//    PersonRepository personRepository;

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    @Override
    public Person fetchPersonById(Long id) {
        return personRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException("the person with id:" + id + " not found"));
    }

    @Override
    public List<Person> fetchAllPersons() {
        return (List<Person>) personRepository.findAll();
    }

    @Override
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person updatePerson(Person person, Long id) {
        Person currentPerson = personRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException("the person with id:" + id + " not found"));

        if (Objects.nonNull(person.getName()) && !"".equalsIgnoreCase(person.getName())) {
            currentPerson.setName(person.getName());
        }

        if (Objects.nonNull(person.getAge())) {
            currentPerson.setAge(person.getAge());
        }

        return personRepository.save(currentPerson);
    }

    @Override
    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }
}
