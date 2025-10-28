package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class GameTest {

    Game gameUnderTest = new Game();

    @Test
    void canCreateGame() {
        assertNotNull(gameUnderTest);
    }

    @Test
    void canAddRollToGame() {
        gameUnderTest.roll(5);
        assertThat(gameUnderTest.score()).isEqualTo(5);
    }

    @Test
    void getSumWhenRollTwice() {
        gameUnderTest.roll(3);
        gameUnderTest.roll(5);
        assertThat(gameUnderTest.score()).isEqualTo(8);
    }

    @Test
    void throwWhenPinsKnockedMoreThan10() {
        assertThatThrownBy(() -> gameUnderTest.roll(11)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void throwWhenPinsKnockedIsNegative() {
        assertThatThrownBy(() -> gameUnderTest.roll(-1)).isInstanceOf(IllegalArgumentException.class);
    }

}

