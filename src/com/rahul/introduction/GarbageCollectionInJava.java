package com.rahul.introduction;

public class GarbageCollectionInJava {
    public static void main(String[] args) {
        Person person;

        for (int i = 0; i < 1000000; i++) {
            person = new Person("Random person");
        }
    }
}

class Person {
    String name;

    public Person (String name) {
//        System.out.println("Object created");
        this.name = name;
    }

    // we cannot decide when the garbage collector will be called,
    // it will be called automatically when java feels the memory is getting filled.

    // but we can decide what to do when the garbage collector destroy the objects
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed");
    }
}