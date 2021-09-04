package com.bl.generic;

import java.util.Scanner;

public class PrintMax <T extends Comparable<T>> {
    //declaring instance variables
        Integer[] arrayOfInt;
        Float []  arrayOfFloat;
        String[] arrayOfString;

        public PrintMax(Integer[] arrayOfInt, Float[] arrayOfFloat, String[] arrayOfString) {
            this.arrayOfInt = arrayOfInt;
            this.arrayOfFloat = arrayOfFloat;
            this.arrayOfString = arrayOfString;
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // taking input for array size
            System.out.println("Enter the size of all three arrays : ");
            int size = scanner.nextInt();

            Integer[] x = new Integer[size];
            Float[] y = new Float[size];
            String[] z = new String[size];

            // getting user input for integer
            System.out.println("Enter " + size + " Integer Values : ");
            for (int i = 0; i < size; i++) {
                x[i] = scanner.nextInt();
            }

            //getting user input for float
            System.out.println("Enter " + size + " Float Values : ");
            for (int i = 0; i < size; i++) {
                y[i] = scanner.nextFloat();
            }

            // getting user input for string
            System.out.println("Enter " + size + " String Values : ");
            for (int i = 0; i < size; i++) {
                z[i] = scanner.next();
            }

            new PrintMax(x, y, z).testMaximum();


        }

        private void testMaximum() {

            //passing instance variable to static method
            Integer maxOfThreeInt = printMax(arrayOfInt);
            System.out.println("The maximum value of three integers is : " + maxOfThreeInt);

            Float maxOfThreeFloat = printMax(arrayOfFloat);
            System.out.println("The maximum value of three floats is : " + maxOfThreeFloat);

            String maxOfThreeString = printMax(arrayOfString);
            System.out.println("The maximum value of three string is : " + maxOfThreeString);
        }

        //displays maximum of three values
        static <T extends Comparable<T>> T printMax(T[] inputArray) {

            T maximum = inputArray[0];
            for (T t : inputArray) {
                if (t.compareTo(maximum) > 0)
                    maximum = t;
            }
            return maximum;
        }
}

