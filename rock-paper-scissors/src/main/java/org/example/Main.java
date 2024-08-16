package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" --- Welcome to rock paper scissors! --- ");

        // Option for multiple human players
        // Option for multiple computer players

        System.out.println("What is your name?");
        String playerName = sc.nextLine();

        System.out.println("What would you like the score limit to be in order to win?");
        int scoreLimit = 3;
        if (sc.hasNextInt()) {
            int userSetLimit = sc.nextInt();
            if (userSetLimit < 1 || userSetLimit > 10) {
                System.out.println("Error: Score limit must be between 1 - 10, set to the default of 3 games.");
            } else {
                scoreLimit = userSetLimit;
            }
        } else {
            System.out.println("Error: Invalid score limit, set to the default of 3 games.");
        }

        System.out.println(playerName);
        System.out.println(scoreLimit);
        // create an instance of the game

        sc.close();
    }
}