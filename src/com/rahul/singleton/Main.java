package com.rahul.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton object1 = Singleton.getInstance();

        Singleton object2 = Singleton.getInstance();

        Singleton object3 = Singleton.getInstance();

        // all 3 objects are pointing to the same object in memory.

    }
}
