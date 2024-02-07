package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepository {
    List<Person> persons = new ArrayList<>();

    public PersonRepository() {
        persons.add(new Person(1, "John", DaysOfWeek.MONDAY, Person.Gender.MALE));
        persons.add(new Person(2, "Jane", DaysOfWeek.FRIDAY, Person.Gender.FEMALE));
        persons.add(new Person(3, "Doe", DaysOfWeek.SATURDAY, Person.Gender.DIVERSE));
        persons.add(new Person(4, "Alice", DaysOfWeek.SUNDAY, Person.Gender.FEMALE));
        persons.add(new Person(5, "Bob", DaysOfWeek.MONDAY, Person.Gender.MALE));
        persons.add(new Person(6, "Charlie", DaysOfWeek.FRIDAY, Person.Gender.DIVERSE));
        persons.add(new Person(7, "David", DaysOfWeek.SATURDAY, Person.Gender.MALE));
    }

    public Optional<Person> getPerson(int id) {
        for (Person person : persons) {
            if (person.id() == id) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public void countPersonsByGender(Person.Gender gender){
        int count = 0;
        for (Person person : persons) {
            if (person.gender().equals(gender)) {
                count++;
            }
        }
        System.out.println("Number of " + gender + " persons: " + count);
    }

    public Optional<Person> getPersonByName(String name) {
        for (Person person : persons) {
            if (person.name().equals(name)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public List<Person> getPersonsByFavoriteDay(DaysOfWeek day) {
        List<Person> personsByDay = new ArrayList<>();
        for (Person person : persons) {
            if (person.favoriteDay().equals(day)) {
                personsByDay.add(person);
            }
        }
        return personsByDay;
    }
}
