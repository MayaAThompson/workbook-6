package com.pluralsight;

import com.pluralsight.utils.IOUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PeopleOperations {
    static List<Person> getPeople() {
        List<Person> people = new ArrayList<>();

        Person person = new Person("Lena", "Carter", 34);
        people.add(person);

        person = new Person("Diego", "Ramirez", 27);
        people.add(person);

        person = new Person("Ava", "Thompson", 41);
        people.add(person);

        person = new Person("Noah", "Kim", 22);
        people.add(person);

        person = new Person("Isabella", "Rossi", 30);
        people.add(person);

        person = new Person("Ethan", "Patel", 36);
        people.add(person);

        person = new Person("Maya", "Nguyen", 29);
        people.add(person);

        person = new Person("John", "O'Connor", 45);
        people.add(person);

        person = new Person("Sofia", "Müller", 33);
        people.add(person);

        person = new Person("Jack", "Johnson", 38);
        people.add(person);
        return people;
    }

    static double getAverageAge(List<Person> people) {
        double sumOfAges = people.stream()
                .map(Person::getAge)
                .reduce(0, Integer::sum);
        return sumOfAges / people.size();
    }

//    static int getOldestAge(List<Person> people) { TODO: figure out better usage of this stream to get oldest age.
//        Optional<Integer> i = people.stream()
//                .map(Person::getAge).sorted().max();
//        return i.orElse(0);
//    }

    public static List<Person> searchPeople(List<Person> people) {
        String fiterString = IOUtils.messageAndResponse("Search for someone: ").toLowerCase();
        List<Person> matchedPeople;
        matchedPeople = people.stream()
                .filter(person -> person.getFirstName().toLowerCase().contains(fiterString) ||
                        person.getLastName().toLowerCase().contains(fiterString))
                        .toList();
        return matchedPeople;
    }

    public static void getAgeStats(List<Person> people) {
        double averageAge = getAverageAge(people);

        Person oldest = Collections.max(people);
        Person youngest = Collections.min(people);

        System.out.println("Average age: " + averageAge);
        System.out.println("Youngest person: " + youngest.getLastName() + ", " + youngest.getFirstName());
        System.out.println("Oldest person: " + oldest.getLastName() + ", " + oldest.getFirstName());
    }
}
