package org.example;

import java.util.Random;

public class Computer extends Player {
    private String name = "Computer";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Result chooseMove(int i) {
        Random rand = new Random();
        int choice = rand.nextInt(3);
        Result result;
        switch (choice) {
            case 0:
                result = Result.ROCK;
                break;
            case 1:
                result = Result.PAPER;
                break;
            case 2:
                result = Result.SCISSORS;
                break;
            default:
                result = null;
                break;
        }

        return result;
    }
}
