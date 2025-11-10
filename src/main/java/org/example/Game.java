package org.example;


public class Game {

    private int gameScore;
    private int currentFrame = 0;
    private int currentThrowInFrame = 0;
    int[][] gameFrameCounter = new int[10][];

    public Game() {
        for(int i = 0; i < 9; i++) {
            gameFrameCounter[i] = new int[2];
        }
        gameFrameCounter[9] = new int[3];
    }

    public void roll(int pinsKnocked) {
        validateNumberOfPinsWithinRollBounds(pinsKnocked);
        validateNumberOfPinsWithinFrameBounds(pinsKnocked);
        gameFrameCounter[currentFrame][currentThrowInFrame] = pinsKnocked;
        gameScore = gameScore + pinsKnocked;
        prepareForNextRoll();
    }

    private void validateNumberOfPinsWithinFrameBounds(int pinsKnocked) {
        if (isNumberOfPinsKnockedExceedingMaxForFrame(pinsKnocked)) {
            throw new IllegalArgumentException();
        }
    }

    private static void validateNumberOfPinsWithinRollBounds(int pinsKnocked) {
        if (isNumberOfPinsKnockedOutOfBound(pinsKnocked)) {
            throw new IllegalArgumentException();
        }
    }

    private void prepareForNextRoll() {
        if (currentFrame == 9 && currentThrowInFrame == 1) {
            currentThrowInFrame++;
        }
        else if (currentThrowInFrame == 1) {
            currentThrowInFrame = 0;
            currentFrame++;
        }
        else {
            currentThrowInFrame ++;
        }
    }



    private static boolean isNumberOfPinsKnockedOutOfBound(int pinsKnocked) {
        return pinsKnocked > 10 || pinsKnocked < 0;
    }

    private boolean isNumberOfPinsKnockedExceedingMaxForFrame(int pinsKnocked) {
        return currentThrowInFrame == 1 && gameFrameCounter[currentFrame][0] + pinsKnocked > 10;
    }

    public int score() {
        return gameScore;
    }
}
