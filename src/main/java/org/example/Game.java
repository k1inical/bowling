package org.example;


public class Game {

    private int gameScore;

    int[][] gameFrameCounter = new int[10][];

    

    for(int i = 0; i < 9; i++){
        gameFrameCounter[i] = new int[2];
    }

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
