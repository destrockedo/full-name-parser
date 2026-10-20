package com.pluralsight;

import java.util.Scanner;

public class nameparser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your full Name: ");
        String fullName = scan.nextLine().trim();

        String firstName;
        String lastName;
        String middleName = "(none)";

        int firstSpace = fullName.indexOf(" ");
        int lastSpace = fullName.lastIndexOf(" ");

        //O starts at 0 firstspace stops it at first space substriong pull from full string
        firstName = fullName.substring(0,firstSpace);

        //Checks middle name if they are eqaul that means theres only one space total
        if (firstSpace == lastSpace) {
            //+1 get rid of spcaae
            lastName = fullName.substring(firstSpace + 1);
        } else {
            //Using first and last space slects what inbetween the 2
            middleName = fullName.substring(firstSpace + 1, lastSpace).trim();
            lastName = fullName.substring(lastSpace + 1);
        }
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);





    }
}
