package com.mah312.springinaction.person;

import java.util.List;

public interface PersonService {

    Person fetchPersonById(Long id);

    List<Person> fetchAllPersons();

    Person savePerson(Person person);

    Person updatePerson(Person person, Long id);

    void deletePerson(Long id);
}
