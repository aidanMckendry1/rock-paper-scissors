package org.example;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public Game(List<Player> players, int scoreLimit) {
        this.players = players;
        this.scoreLimit = scoreLimit;
    }

    private List<Player> players = new ArrayList<Player>();
    private int scoreLimit = 0;

    public int getScoreLimit() {
        return scoreLimit;
    }

    public void setScoreLimit(int scoreLimit) {
        this.scoreLimit = scoreLimit;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void addPlayers(Player player) {
        this.players.add(player);
    }
}
