package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DemoTest {

    @Test
    void should_return_y_plus_1_when_executeCommand_given_00N_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        //when
        marsRover.executeCommands("M");

        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(1,marsRover.getLocationY());
        assertEquals("N",marsRover.getDirection());

    }
}
