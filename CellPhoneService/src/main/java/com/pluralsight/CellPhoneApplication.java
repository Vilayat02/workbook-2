package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();

        // Set values using setters
        cellPhone.setSerialNumber(1234567);
        cellPhone.setModel("iPhone X");
        cellPhone.setCarrier("AT&T");
        cellPhone.setPhoneNumber("800-555-5555");
        cellPhone.setOwner("Dana Wyatt");

        // Print values using getters
        System.out.println("Serial Number: " + cellPhone.getSerialNumber());
        System.out.println("Model: " + cellPhone.getModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Phone Number: " + cellPhone.getPhoneNumber());
        System.out.println("Owner: " + cellPhone.getOwner());
    }
}
