package com.rahul.staticExample;

class InnerClass {
    String name;
    public InnerClass (String name) {
        this.name = name;
    }
}

// outside classes cannot be static
public class MyClass {
    // inner classes can be static or non-static (both allowed)


    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass("MyObject");
        System.out.println(innerClass.name);
    }
}

// why inner classes can be static but outer classes cannot be static?
// because outer classes don't depend on any other class, but inner classes can depend on the outer ones.