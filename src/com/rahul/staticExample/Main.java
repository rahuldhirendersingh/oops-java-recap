package com.rahul.staticExample;

public class Main {
    public static void main(String[] args) {
        Human rahul = new Human(22, "Rahul", 6.1f, 83.7f);
        Human sachin = new Human(23, "Sachin", 5.9f, 73.5f);
        Human pooja = new Human(28, "Pooja", 5.2f, 67.3f);

//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);

        // inside a static method you cannot use anything non-static
        // without having an instance of that class.

        // message(); // error: if message() non-static.
        message();
    }

    static void message() {
        System.out.println("I love cheese burgers");
//        temp(); // cannot call temp() here, as temp() depends on an instance
        // and static methods don't belong to instances.

        // but you can obviously use it via using an instance
        Main main = new Main();
        main.temp(); // this is allowed.

    }

    void temp() {
        message(); // no problem as (static / non-static both allowed) inside non-static.
        System.out.println("I am temp");
        // temp() will get an instance whenever it is called,
        // the same instance can be shared with temp2() also.
        temp2(); // allowed to call temp2() here, as temp() also non-static
    }

    void temp2() {
        System.out.println("I am temp2");
    }
}
