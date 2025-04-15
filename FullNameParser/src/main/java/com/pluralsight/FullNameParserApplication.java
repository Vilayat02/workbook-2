package com.pluralsight;

import java.util.Scanner;

public class FullNameParserApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = sc.nextLine().trim();
        String[] parts = name.split(" ");
        String firstName = null;
        String middleName = null;
        String lastName = null;
       /* for(int i = 0; i < parts.length; i++){    //Checking array
            System.out.println(parts[i]);
        }*/
        if (parts.length == 3){
            firstName = parts[0];
            middleName = parts[1];
            lastName = parts[2];
        }
        else if (parts.length == 2) {
            firstName = parts[0];
            lastName = parts[1];
        }
        else {
            System.out.println("Please enter at least Name and Surname.");
        }
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
    }
}
