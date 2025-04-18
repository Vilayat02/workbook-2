package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle[] arr = new Vehicle[20];
        int vehicleCount = 0;

        // Предзагрузка 6 машин
        arr[vehicleCount++] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        arr[vehicleCount++] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        arr[vehicleCount++] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        arr[vehicleCount++] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        arr[vehicleCount++] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        arr[vehicleCount++] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        while (true) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");
            System.out.print("Enter your command: ");
            int choice = sc.nextInt();
            sc.nextLine(); // очистка буфера

            if (choice == 1) {
                System.out.println("\n--- All Vehicles ---");
                for (int i = 0; i < vehicleCount; i++) {
                    System.out.println(arr[i]);
                }
            } else if (choice == 2) {
                System.out.print("Enter make/model to search: ");
                String searchModel = sc.nextLine().toLowerCase();
                System.out.println("\n--- Search Results ---");
                for (int i = 0; i < vehicleCount; i++) {
                    if (arr[i].getMakeModel().toLowerCase().contains(searchModel)) {
                        System.out.println(arr[i]);
                    }
                }
            } else if (choice == 3) {
                System.out.print("Enter minimum price: ");
                float min = sc.nextFloat();
                System.out.print("Enter maximum price: ");
                float max = sc.nextFloat();
                System.out.println("\n--- Vehicles in Price Range ---");
                for (int i = 0; i < vehicleCount; i++) {
                    if (arr[i].getPrice() >= min && arr[i].getPrice() <= max) {
                        System.out.println(arr[i]);
                    }
                }
            } else if (choice == 4) {
                System.out.print("Enter color to search: ");
                String colorSearch = sc.nextLine().toLowerCase();
                System.out.println("\n--- Vehicles by Color ---");
                for (int i = 0; i < vehicleCount; i++) {
                    if (arr[i].getColor().toLowerCase().equals(colorSearch)) {
                        System.out.println(arr[i]);
                    }
                }
            } else if (choice == 5) {
                if (vehicleCount >= arr.length) {
                    System.out.println("Cannot add more vehicles. Inventory is full.");
                    continue;
                }

                System.out.print("Enter vehicle ID: ");
                long id = sc.nextLong();
                sc.nextLine(); // очистка буфера

                System.out.print("Enter vehicle model: ");
                String model = sc.nextLine();

                System.out.print("Enter color: ");
                String color = sc.nextLine();

                System.out.print("Enter odometer reading: ");
                int odometer = sc.nextInt();

                System.out.print("Enter price: ");
                float price = sc.nextFloat();
                sc.nextLine(); // очистка буфера

                arr[vehicleCount++] = new Vehicle(id, model, color, odometer, price);
                System.out.println("Vehicle added successfully.");
            } else if (choice == 6) {
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
        }
    }
