package org.example;

public class Human extends Player {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Result chooseMove() {
        return null;
    }
}
