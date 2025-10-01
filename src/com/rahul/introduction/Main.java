package com.rahul.introduction;

public class Main {
    public static void main(String[] args) {
        // store 5 drivers name.
        String[] names = new String[5];

        // store 5 drivers carrier podiums.
        int[] podiums = new int[5];

        // store details of 5 formula 1 drivers: [age, name, podiums]
        Driver[] drivers = new Driver[5];
        // now each element of this array is storing a driver.

        Driver driver = new Driver();
        Driver max = new Driver(28, "Max Verstappen", 120);
        Driver kimi = new Driver(19, "Kimi Antonelli", 1);
        Driver random = new Driver(max);

//        max.age = 28;
//        max.name = "Max Verstappen";
//        max.podiums = 120;
        System.out.println(max.age);
        System.out.println(max.name);
        System.out.println(max.podiums);

        System.out.println(kimi.age);
        System.out.println(kimi.name);
        System.out.println(kimi.podiums);

        System.out.println(random.age);
        System.out.println(random.name);
        System.out.println(random.podiums);

        Driver driver1 = new Driver();
        Driver driver2 = driver1;

        // changes made by one reference variable will change both as,
        // both reference variable are pointing to the same object in memory.
        driver1.name = "new name";
        System.out.println(driver1.name);
        System.out.println(driver2.name);
    }
}

class Driver {
    int age;
    String name;
    int podiums;

    Driver (Driver other) {
        this.age = other.age;
        this.name = other.name;
        this.podiums = other.podiums;
    }

    Driver () {
        // this is how you call a constructor from another constructor.
        // internally it will be like: new Student(18, "default driver", 0);
        this (18, "default driver", 0);
    }

    Driver (int age, String name, int podiums) {
        this.age = age;
        this.name = name;
        this.podiums = podiums;
    }
}
