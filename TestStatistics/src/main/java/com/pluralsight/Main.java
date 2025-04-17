package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        int[] testScore = {45, 76, 87, 65, 34, 12, 90, 56, 39, 42};
        int sum = 0;
        int highScore = testScore[0];
        int lowScore = testScore[0];
        for (int i = 0; i < testScore.length; i++) {
            sum += testScore[i];
            if (testScore[i] > highScore){
                highScore = testScore[i];
            }
        }
        for (int i = 0; i < testScore.length; i++) {
            if (testScore[i] < lowScore){
                lowScore = testScore[i];
            }
        }
        double average = (double) sum/ testScore.length;

        System.out.println("Higher score is " + highScore);
        System.out.println("Lower score is " + lowScore);
        System.out.println("The average is " + average);

    }
}
