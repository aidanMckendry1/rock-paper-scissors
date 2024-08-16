package org.example;

public abstract class Player {
    public abstract Result chooseMove(int i);

    private int score = 0;

    public void incrementScore() {
        this.score = score +1;
    }
    public int getScore() {
        return score;
    }
}
