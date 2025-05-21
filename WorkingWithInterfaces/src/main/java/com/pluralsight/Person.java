package com.pluralsight;

public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private Integer age;

    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        return (this.lastName + this.firstName).compareTo(p.getLastName() + p.getFirstName());
    }

    @Override
    public boolean equals(Object otherObject) {
        return otherObject instanceof Person && this.compareTo((Person) otherObject) == 0;
    }

    @Override
    public int hashCode() {
        return (this.lastName + this.firstName).hashCode();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
