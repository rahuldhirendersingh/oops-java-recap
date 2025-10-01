package com.rahul.introduction;

public class FinalKeyword {
    public static void main(String[] args) {
        final int salary = 40000;
        System.out.println(salary);

//        salary = 49000; // error: cannot assign a value to final variable salary
//        System.out.println(salary);

        final User user = new User("Tom");
        user.name = "Jim"; // Allowed
//        user = new User("Kelly"); // Not Allowed
        System.out.println(user.name);

    }
}

class User {
    String name;

    User (String name) {
        this.name = name;
    }
}