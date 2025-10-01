package com.rahul.introduction;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 30;
//        int b = 60;
//        Integer num = 90;

        Integer a = 30;
        Integer b = 60;
        swap(a, b); // still not swaping it, as Integer is a final class
        System.out.println(a + " " + b);
    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

}
