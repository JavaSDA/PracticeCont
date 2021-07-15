package com.company;

public class Person {

    // Attributes of the person object
    private String name;
    private int age;

    // add constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // add getters and setters.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
