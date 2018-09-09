package com.company.instances;

public class Human {
    String name;
    String surname;
    int age;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human " + surname + " " + name + " is " + age + " years old.";
    }
}
