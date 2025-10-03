package com.rahul.staticExample;

public class StaticBlock {
    static int i = 7;
    static int j;

    // static block will only run once, when the first obj is created,
    // i.e. when the class is loaded for the first time.
    static {
        System.out.println("Hi, I am a static block");
        j = i * 3;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.i + " " + StaticBlock.j);

        StaticBlock.j += 10;
        System.out.println(StaticBlock.i + " " + StaticBlock.j);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.i + " " + StaticBlock.j);
    }
}
