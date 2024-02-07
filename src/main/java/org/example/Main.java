package org.example;

/*

    ###Step 1: Create an enum DaysOfWeek with the weekdays (Monday to Sunday).

    ###Step 2: Write a method that returns the passed weekday as a string if it is a weekday (Monday to Friday), otherwise return 'Weekend'.

    ###Step 3: Create a record 'Person' with the properties 'id', 'name', and 'favoriteDay', where 'favoriteDay' is of type DaysOfWeek.

    ###Step 4: Create a class PersonRepository with a list/map of persons.

    ###Step 5: Write a method in the class PersonRepository that searches for and returns a person based on their id from the list/map. The method should return an Optional.

    ###Step 6: In your main method, check if the person exists. If they do, print the name and favorite day of the week to the console.


    Expand the Person record with an enum Gender (Male, Female, Diverse).

    Write a method in the PersonRepository that counts the number of persons by gender and outputs the results.

    Add a method in the PersonRepository that searches and returns a person by their name. The method should return an Optional.

    Write a method in the PersonRepository that searches and returns all persons by their favorite weekday. The method should return a list.

 */

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(DaysOfWeek.MONDAY);
        System.out.println(DaysOfWeek.SATURDAY);

        PersonRepository personRepository = new PersonRepository();
        Optional<Person> person = personRepository.getPerson(2);
        person.ifPresent(p -> System.out.println(p.name() + " " + p.favoriteDay()));

        personRepository.countPersonsByGender(Person.Gender.FEMALE);
        personRepository.countPersonsByGender(Person.Gender.DIVERSE);
        personRepository.countPersonsByGender(Person.Gender.MALE);

        System.out.println(personRepository.getPersonByName("John"));
        System.out.println(personRepository.getPersonsByFavoriteDay(DaysOfWeek.MONDAY));
        System.out.println(personRepository.getPersonsByFavoriteDay(DaysOfWeek.THURSDAY));
    }

    public String getWeekday(DaysOfWeek day) {
        if (day == DaysOfWeek.MONDAY || day == DaysOfWeek.TUESDAY || day == DaysOfWeek.WEDNESDAY || day == DaysOfWeek.THURSDAY || day == DaysOfWeek.FRIDAY) {
            return day.toString();
        } else {
            return "Weekend";
        }
    }
}