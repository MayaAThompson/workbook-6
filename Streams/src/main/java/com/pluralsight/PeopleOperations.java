package com.pluralsight;

import com.pluralsight.utils.IOUtils;

import java.util.ArrayList;
import java.util.List;

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

        person = new Person("Liam", "O'Connor", 45);
        people.add(person);

        person = new Person("Sofia", "Müller", 33);
        people.add(person);

        person = new Person("Jack", "Wilson", 38);
        people.add(person);
        return people;
    }

    static double getAverageAge(List<Person> people) {
        double ageSum = 0;
        for (Person p : people) {
            ageSum += p.getAge();
        }
        return ageSum / people.size();
    }

    public static List<Person> searchPeople(List<Person> people) {
        String fiterString = IOUtils.messageAndResponse("Search for someone: ");
        List<Person> matchedPeople = new ArrayList<>();
        for (Person p : people) {
            if (p.getFirstName().equalsIgnoreCase(fiterString) ||
                    p.getLastName().equalsIgnoreCase(fiterString))
                matchedPeople.add(p);
        }
        return matchedPeople;
    }
}
