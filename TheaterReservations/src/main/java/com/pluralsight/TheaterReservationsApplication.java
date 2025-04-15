package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservationsApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();
        String[] name = fullName.split(" ");
        System.out.println("What date will tou be coming (MM/dd/yyyy): ");
        String dateInput = sc.nextLine();
        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateInput,inputFormat);
        System.out.print("How many tickets would you like? ");
        int ticket = sc.nextInt();

        if (ticket > 1){
            System.out.println(ticket + " tickets reserved for " + date.format(outputFormat) + " under " + name[1] + ", " + name[0]);
        }
        else if(ticket == 1){
            System.out.println(ticket + " ticket reserved for " + date.format(outputFormat) + " under " + name[1] + ", " + name[0]);
        }
        else {
            System.out.println("Wrong ticket response!");
        }

    }
}
