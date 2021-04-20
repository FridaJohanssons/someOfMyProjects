package com.exempel.fridalabb2;

public abstract class Person {

    private String name;
    private String age;
    private String telephoneNumber;

    public Person(String name, String age, String telephoneNumber) {
        this.name = name;
        this.age = age;
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }
    public String getAge() {
        return age;
    }
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

}
