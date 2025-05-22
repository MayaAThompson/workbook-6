package com.pluralsight;

import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Person> people = PeopleOperations.getPeople();

        List<Person> matchedPeople = PeopleOperations.searchPeople(people);

        if (!matchedPeople.isEmpty()) {
            System.out.println("Found these people for you:\n");
            for (Person p : matchedPeople) {
                System.out.println(p.getLastName() +", " + p.getFirstName());
            }
        }
        else
            System.out.println("No matches found.");


        double averageAge = PeopleOperations.getAverageAge(people);

        Person oldest = Collections.max(people);
        Person youngest = Collections.min(people);

        System.out.println("Average age: " + averageAge);
        System.out.println("Youngest person: " + youngest.getLastName() + ", " + youngest.getFirstName());
        System.out.println("Oldest person: " + oldest.getLastName() + ", " + oldest.getFirstName());
    }

}
