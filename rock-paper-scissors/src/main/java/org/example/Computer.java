package org.example;

import java.util.Random;

public class Computer extends Player {
    @Override
    public Result chooseMove() {
        Random rand = new Random();
        int choice = rand.nextInt(3);
        Result result;
        switch (choice) {
            case 1:
                result = Result.ROCK;
                break;
            case 2:
                result = Result.PAPER;
                break;
            case 3:
                result = Result.SCISSORS;
                break;
            default:
                result = Result.ROCK;
                break;
        }

        return result;
    }
}
