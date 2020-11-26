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
    @Test
    void should_return_W_when_executeCommand_given_00N_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        //when
        marsRover.executeCommands("L");

        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("W",marsRover.getDirection());

    }
    @Test
    void should_return_E_when_executeCommand_given_00N_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        //when
        marsRover.executeCommands("R");

        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("E",marsRover.getDirection());

    }
    @Test
    void should_return_S_when_executeCommand_given_00E_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        //when
        marsRover.executeCommands("R");

        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("S",marsRover.getDirection());

    }
    @Test
    void should_return_x_plus_1_when_executeCommand_given_00E_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");
        //when
        marsRover.executeCommands("M");

        //then
        assertEquals(1,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("E",marsRover.getDirection());

    }
    @Test
    void should_return_y_minus_1_when_executeCommand_given_00S_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        //when
        marsRover.executeCommands("M");

        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(-1,marsRover.getLocationY());
        assertEquals("S",marsRover.getDirection());

    }
    @Test
    void should_return_x_minus_1_when_executeCommand_given_00W_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        //when
        marsRover.executeCommands("M");

        //then
        assertEquals(-1,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("W",marsRover.getDirection());

    }
}
