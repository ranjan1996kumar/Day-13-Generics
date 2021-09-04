package com.bl.generic;

import java.util.Scanner;

public class FindMaxString {
    //return the maximum value of three strings
        public static String findMax(String x, String y, String z) {
            String maximum = x;
            if(y.compareTo(maximum)> 0)
                maximum = y;
            if(z.compareTo(maximum)>0)
                maximum = z;
            return maximum;
        }
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the first String : ");
            String str1 = scan.next();
            System.out.println("Enter the second String : ");
            String str2 = scan.next();
            System.out.println("Enter the third String : ");
            String str3 = scan.next();

            String max = findMax(str1,str2,str3);
            System.out.printf("The max of three strings \"%s\" \"%s\" \"%s\" is : \"%s\" \n",str1,str2,str3,max);
        }
    }
