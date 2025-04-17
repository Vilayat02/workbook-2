package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone();
        cellPhone1.setSerialNumber(1234567);
        cellPhone1.setModel("iPhone X");
        cellPhone1.setCarrier("AT&T");
        cellPhone1.setPhoneNumber("714-512-5179");
        cellPhone1.setOwner("Dana Wyatt");
        cellPhone1.dial();

        CellPhone cellPhone2 = new CellPhone();
        cellPhone2.setSerialNumber(1269323);
        cellPhone2.setModel("iPhone X");
        cellPhone2.setCarrier("Verizon");
        cellPhone2.setPhoneNumber("800-555-5555");
        cellPhone2.setOwner("Andrey Vershinin");
        cellPhone2.dial();

        display(cellPhone1);
        display(cellPhone2);
    }
    public static void display(CellPhone phone){
        CellPhone cellPhone = new CellPhone();
        System.out.println("Serial Number: " + cellPhone.getSerialNumber());
        System.out.println("Model: " + cellPhone.getModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Phone Number: " + cellPhone.getPhoneNumber());
        System.out.println("Owner: " + cellPhone.getOwner());

    }
}
