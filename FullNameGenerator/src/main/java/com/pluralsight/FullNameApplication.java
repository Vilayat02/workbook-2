package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("If you don't have middle name skip this step\nEnter middle name:");
        String middle = sc.nextLine();
        System.out.print("Enter your surname: ");
        String surname = sc.nextLine();
        System.out.print("If you have suffix enter here: ");
        String suffix = sc.nextLine();
        String fullName = name;
       // String fullName = name + " " + middle.trim() + " " + surname + " " + suffix.trim();
        /*   if (middle == null && suffix == null){
            fullName = name.trim() + surname.trim();
        }
       else if (middle == null){
            fullName = name + " " + surname + " " + suffix;
        }
       else if (suffix == null){
            fullName = name + " " + middle + " " + surname.trim();
      */
        if(!middle.trim().isEmpty()){
            fullName += " " + middle;
        }
        fullName += " " + surname;
        if (!suffix.trim().isEmpty()){
            fullName += " " + suffix;
        }



        System.out.println(fullName.trim());
    }
}
