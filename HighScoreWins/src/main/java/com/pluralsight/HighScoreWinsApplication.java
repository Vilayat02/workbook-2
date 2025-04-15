package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWinsApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your team and score info (ex. Home:Visitor|21:9):");
        String gameScore = sc.nextLine().replace(" ", "").trim();
        String[] arr = gameScore.split(Pattern.quote("|"));
        String[] teams = arr[0].split(Pattern.quote(":"));
        String[] score = arr[1].split(Pattern.quote(":"));
        int score1 = Integer.parseInt(score[0]);
        int score2 = Integer.parseInt(score[1]);

        if(score1 > score2){
            System.out.println("Winner: " + teams[0]);
        }
        else if (score1 < score2) {
            System.out.println("Winner: " + teams[1]);
        }
        else{
            System.out.println("Both teams have the same score!");
        }

    }
}
