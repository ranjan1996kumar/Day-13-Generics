package com.bl.generic;

public class FindMaxInt {
    public static Integer max(Integer x, Integer y, Integer z) {
        Integer maximum = x;
        if (y.compareTo(maximum) > 0) {
            maximum = y;
        }
        if (z.compareTo(maximum) > 0) {
            maximum = z;
        }
        System.out.println("Maximum number is " + maximum);
        return maximum;
    }

    public static void main(String[] args) {
        // test case 1.1 :- maximum number at 1st position
        Integer integerOne = max(6, 7, 3);
        // test case 1.2 :- maximum number at 2nd position
        Integer integerTwo = max(2, 3, 1);
        // test case 1.3 :- maximum number at 3rd position
        Integer integerThree = max(3, 4, 6);
    }
}