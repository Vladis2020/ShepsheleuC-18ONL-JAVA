package org.example;


public class Main {
    public static void main(String[] args) {
        User user1 = new User(" Alex ", " Petrov ", 22, "male");
        user1.increaseAge();
        user1.increaseAge();
        user1.nameInfo();
        user1.displayInfo();

        User user2 = new User("Vitaliy", "Sinicin");
        user2.displayInfo();

    }
}