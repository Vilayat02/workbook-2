package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1, roll2, rollSum, totalSum = 0;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;
        for (int i = 0; i < 20; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            totalSum += roll1 + roll2;
            rollSum = roll1 + roll2;
            System.out.println("Roll 1: " + roll1 + " Roll 2: " + roll2 + " Sum: " + rollSum + "\n ---------------------");
            if (roll1 == 2) {
                twoCounter++;
            }
           else if (roll1 == 4) {
                fourCounter++;
            }
           else if (roll1 == 6) {
                sixCounter++;
            }
           else if (roll1 == 7) {
               sevenCounter++;
            }
        }
        System.out.println("Total sum: " + totalSum);
    }
}
