package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" --- Welcome to rock paper scissors! --- ");

        // Option for multiple human players
        // Option for multiple computer players
        System.out.println("What is your name?");
        String playerName = sc.nextLine();

        // setting score limit
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

        // initializing the game
        List<Player> players = new ArrayList<>();
        Human player1 = new Human(playerName);
        Computer ai1 = new Computer();
        players.add(player1);
        players.add(ai1);
        Game game = new Game(players, scoreLimit);

        while (player1.getScore() < game.getScoreLimit()  && ai1.getScore() < game.getScoreLimit()) {
            System.out.println(" --- New round! --- ");
            System.out.println("Current scores -> " + player1.getName() + ": " +player1.getScore());
            System.out.println("Current scores -> " + ai1.getName() + ": " +ai1.getScore());

            System.out.println("1 - Rock");
            System.out.println("2 - Paper");
            System.out.println("3 - Scissors");

            Result playerChoice = player1.chooseMove(sc.nextInt());
            Result computerChoice = ai1.chooseMove(0);

            if (playerChoice == Result.ROCK) {
                if (computerChoice == Result.ROCK) {
                    System.out.println("You chose " + playerChoice);
                    System.out.println("Computer chose " + computerChoice);
                    System.out.println("Draw, no points allocated");
                } else if (computerChoice ==Result.PAPER) {
                    System.out.println("You chose " + playerChoice);
                    System.out.println("Computer chose " + computerChoice);
                    System.out.println("Oh no, you lost this round");
                    ai1.incrementScore();
                } else if (computerChoice == Result.SCISSORS) {
                    System.out.println("You chose " + playerChoice);
                    System.out.println("Computer chose " + computerChoice);
                    System.out.println("You won this round!");
                    player1.incrementScore();
                }
            } else if (playerChoice == Result.PAPER) {
                if (computerChoice == Result.ROCK) {
                    System.out.println("You chose " + playerChoice);
                    System.out.println("Computer chose " + computerChoice);
                    System.out.println("You won this round!");
                    player1.incrementScore();
                } else if (computerChoice ==Result.PAPER) {
                    System.out.println("You chose " + playerChoice);
                    System.out.println("Computer chose " + computerChoice);
                    System.out.println("Draw, no points allocated");
                } else if (computerChoice == Result.SCISSORS) {
                    System.out.println("You chose " + playerChoice);
                    System.out.println("Computer chose " + computerChoice);
                    System.out.println("Oh no, you lost this round");
                    ai1.incrementScore();
                }

            } else if (playerChoice == Result.SCISSORS) {
                if (computerChoice == Result.ROCK) {
                    System.out.println("You chose " + playerChoice);
                    System.out.println("Computer chose " + computerChoice);
                    System.out.println("Oh no, you lost this round");
                    ai1.incrementScore();
                } else if (computerChoice == Result.PAPER) {
                    System.out.println("You chose " + playerChoice);
                    System.out.println("Computer chose " + computerChoice);
                    System.out.println("You won this round!");
                    player1.incrementScore();
                } else if (computerChoice == Result.SCISSORS) {
                    System.out.println("You chose " + playerChoice);
                    System.out.println("Computer chose " + computerChoice);
                    System.out.println("Draw, no points allocated");
                }
            }
        }

        if (player1.getScore() > ai1.getScore()) {
            System.out.println("WINNER!!! " + player1.getName() + " you have won the game, thanks for playing.");
        } else {
            System.out.println("LOSER!!! " + player1.getName() + " you have lost the game, thanks for playing.");
        }

        sc.close();
    }
}