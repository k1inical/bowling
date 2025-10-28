package org.example;

public class Game {

    private int gameScore;

    public void roll(int pinsKnocked) {
        if (pinsKnocked > 10 || pinsKnocked < 0) {
            throw new IllegalArgumentException();
        }
        gameScore = gameScore + pinsKnocked;
    }

    public int score() {
        return gameScore;
    }
}
