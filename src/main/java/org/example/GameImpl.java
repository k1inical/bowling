package org.example;

public class GameImpl implements Game {

    private int gameScore;

    @Override
    public void roll(int score) {
        gameScore = score;
    }

    @Override
    public int score() {
        return gameScore;
    }
}
