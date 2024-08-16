package org.example;

public class Human extends Player {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Result chooseMove(int i) {
        Result result;
        switch (i) {
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
                result = null;
                break;
        }

        return result;
    }
}
