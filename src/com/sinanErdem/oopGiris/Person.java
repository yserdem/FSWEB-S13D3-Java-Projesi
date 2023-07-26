package com.sinanErdem.oopGiris;

public class Person {
    String firstname;
    String lastname;
    int age;
    double heightInMeters;
    char gender;
    int weight;

    public Person(String firstname, String lastname, int age) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public Person(String firstname, String lastname, int age, double heightInMeters, char gender, int weight) {
        this(firstname, lastname, age);
        this.gender = gender;
        this.heightInMeters = heightInMeters;
        this.weight = weight;
    }

    public String getFirstName() {
        return this.firstname;
    }
    public String getLastName() {
        return this.lastname;
    }

    public int getAge() {
        return this.age;
    }
    public boolean isTeen() {
        return this.age >= 13 && this.age <= 19;
    }
}
