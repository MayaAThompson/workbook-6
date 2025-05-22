package com.pluralsight;

import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Person> people = PeopleOperations.getPeople();

        List<Person> matchedPeople = PeopleOperations.searchPeople(people);

        if (!matchedPeople.isEmpty()) {
            System.out.println("Found these people for you:\n");
            for (Person p : matchedPeople) {
                System.out.println(p.getLastName() +", " + p.getFirstName() + " Age: " + p.getAge());
            }
        }
        else {
            System.out.println("No matches found.");
        }

        PeopleOperations.getAgeStats(people);
    }

}
