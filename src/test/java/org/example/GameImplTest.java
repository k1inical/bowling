package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class GameImplTest {

    GameImpl gameUnderTest = new GameImpl();

    @Test
    void canCreateGame() {
        assertNotNull(gameUnderTest);
        assertThat(gameUnderTest.score()).isEqualTo(0);
    }

    @Test
    void canAddRollToGame() {
        gameUnderTest.roll(5);
        assertThat(gameUnderTest.score()).isEqualTo(5);
    }


}

