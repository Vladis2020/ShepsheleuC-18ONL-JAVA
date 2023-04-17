package org.example;

public class User {
    String firstName;
    String secondName;
    Integer age;
    String gender;

    public User(String firstName, String secondName, Integer age, String gender) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.gender = gender;

    }

    public User(String firstName, String secondName, Integer age) {
        this(firstName, secondName);
        this.age = age;
        this.gender = gender;

    }

    public User(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.gender = gender;

    }

    public String nameInfo() {
        return firstName + secondName;

    }

    public void increaseAge() {
        this.age++;
    }

    public void displayInfo() {
        System.out.println("Name:" + firstName + "Second name:" + secondName + "Age: " + age + " Gender: " + gender);
    }


}
