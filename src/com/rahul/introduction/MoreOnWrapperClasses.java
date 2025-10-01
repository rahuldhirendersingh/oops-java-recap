package com.rahul.introduction;

import java.util.ArrayList;

public class MoreOnWrapperClasses {
    public static void main(String[] args) {
        // Autoboxing: int -> Integer
        int num = 10;
        Integer obj = num; // java automatically does: Integer.valueOf(num)

        // Useful in collections
        // as collections only store objects not primitives
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // int is converted -> Integer
        list.add(20);
        System.out.println(list);

        // without autoboxing you'd have to write:
        // list.add(Integer.valueOf(5))


        // Unboxing
        Integer obj2 = 80; // Autoboxing
        int num2 = obj2; // Unboxing

        // without unboxing you'd have to write:
//        int num2 = obj.intValue();

    }
}
