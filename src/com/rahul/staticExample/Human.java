package com.rahul.staticExample;

public class Human {
    int age;
    String name;
    float height;
    float weight;
    static long population;

    // "this" keyword inside static
    static void message() {
        System.out.println("Hello, there!");
//        System.out.println(this.age); // can't use this over here, same reason.
    }

    public Human(int age, String name, float height, float weight) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
        Human.population++;
    }
}
