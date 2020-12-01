package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MarsRoverTest {

    @Test
    void should_return_y_plus_1_when_invoker_execute_given_invoker_marsrover_00N_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.NORTH);
        //when
        Invoker invoker = new Invoker(marsRover);
        invoker.receiveCommand(MarsRoverConstant.COMMAND_MOVE);
        invoker.execute();

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals(Direction.NORTH, marsRover.getDirection());

    }
//
//    @Test
//    void should_return_W_when_executeCommand_given_00N_L() {
//        //given
//        MarsRover marsRover = new MarsRover(0, 0, Direction.NORTH);
//        //when
//        marsRover.executeCommands("L");
//
//        //then
//        assertEquals(0, marsRover.getLocationX());
//        assertEquals(0, marsRover.getLocationY());
//        assertEquals(Direction.WEST, marsRover.getDirection());
//
//    }
//
//    @Test
//    void should_return_E_when_executeCommand_given_00N_R() {
//        //given
//        MarsRover marsRover = new MarsRover(0, 0, Direction.NORTH);
//        //when
//        marsRover.executeCommands("R");
//
//        //then
//        assertEquals(0, marsRover.getLocationX());
//        assertEquals(0, marsRover.getLocationY());
//        assertEquals(Direction.EAST, marsRover.getDirection());
//
//    }
//
//    @Test
//    void should_return_S_when_executeCommand_given_00E_R() {
//        //given
//        MarsRover marsRover = new MarsRover(0, 0, Direction.EAST);
//        //when
//        marsRover.executeCommands("R");
//
//        //then
//        assertEquals(0, marsRover.getLocationX());
//        assertEquals(0, marsRover.getLocationY());
//        assertEquals(Direction.SOUTH, marsRover.getDirection());
//
//    }
//
//    @Test
//    void should_return_N_when_executeCommand_given_00E_L() {
//        //given
//        MarsRover marsRover = new MarsRover(0, 0, Direction.EAST);
//        //when
//        marsRover.executeCommands("L");
//
//        //then
//        assertEquals(0, marsRover.getLocationX());
//        assertEquals(0, marsRover.getLocationY());
//        assertEquals(Direction.NORTH, marsRover.getDirection());
//
//    }
//
//    @Test
//    void should_return_x_plus_1_when_executeCommand_given_00E_M() {
//        //given
//        MarsRover marsRover = new MarsRover(0, 0, Direction.EAST);
//        //when
//        marsRover.executeCommands("M");
//
//        //then
//        assertEquals(1, marsRover.getLocationX());
//        assertEquals(0, marsRover.getLocationY());
//        assertEquals(Direction.EAST, marsRover.getDirection());
//
//    }
//
//    @Test
//    void should_return_y_minus_1_when_executeCommand_given_00S_M() {
//        //given
//        MarsRover marsRover = new MarsRover(0, 0, Direction.SOUTH);
//        //when
//        marsRover.executeCommands("M");
//
//        //then
//        assertEquals(0, marsRover.getLocationX());
//        assertEquals(-1, marsRover.getLocationY());
//        assertEquals(Direction.SOUTH, marsRover.getDirection());
//
//    }
//
//    @Test
//    void should_return_E_when_executeCommand_given_00S_L() {
//        //given
//        MarsRover marsRover = new MarsRover(0, 0, Direction.SOUTH);
//        //when
//        marsRover.executeCommands("L");
//
//        //then
//        assertEquals(0, marsRover.getLocationX());
//        assertEquals(0, marsRover.getLocationY());
//        assertEquals(Direction.EAST, marsRover.getDirection());
//
//    }
//
//    @Test
//    void should_return_W_when_executeCommand_given_00S_R() {
//        //given
//        MarsRover marsRover = new MarsRover(0, 0, Direction.SOUTH);
//        //when
//        marsRover.executeCommands("R");
//
//        //then
//        assertEquals(0, marsRover.getLocationX());
//        assertEquals(0, marsRover.getLocationY());
//        assertEquals(Direction.WEST, marsRover.getDirection());
//
//    }

    @Test
    void should_return_x_minus_1_when_executeCommand_given_00W_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.WEST);
        //when
        Invoker invoker = new Invoker(marsRover);
        invoker.receiveCommand(MarsRoverConstant.COMMAND_MOVE);
        invoker.execute();

        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(Direction.WEST, marsRover.getDirection());

    }
//
//    @Test
//    void should_return_N_when_executeCommand_given_00W_R() {
//        //given
//        MarsRover marsRover = new MarsRover(0, 0, Direction.WEST);
//        //when
//        marsRover.executeCommands("R");
//
//        //then
//        assertEquals(0, marsRover.getLocationX());
//        assertEquals(0, marsRover.getLocationY());
//        assertEquals(Direction.NORTH, marsRover.getDirection());
//
//    }
//    @Test
//    void should_return_N_when_executeCommand_given_00W_L() {
//        //given
//        MarsRover marsRover = new MarsRover(0, 0, Direction.WEST);
//        //when
//        marsRover.executeCommands("L");
//
//        //then
//        assertEquals(0, marsRover.getLocationX());
//        assertEquals(0, marsRover.getLocationY());
//        assertEquals(Direction.SOUTH, marsRover.getDirection());
//
//    }
//
//
//    @Test
//    void should_return_minus11N_when_executeCommand_given_00N_MLMR() {
//        //given
//        MarsRover marsRover = new MarsRover(0, 0, Direction.NORTH);
//        //when
//        marsRover.executeCommands("MLMR");
//
//        //then
//        assertEquals(-1, marsRover.getLocationX());
//        assertEquals(1, marsRover.getLocationY());
//        assertEquals(Direction.NORTH, marsRover.getDirection());
//
//    }

}
