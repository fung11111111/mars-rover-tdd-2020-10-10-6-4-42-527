package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class MarsRoverTest {

    @Test
    void should_return_y_plus_1_when_invoker_execute_given_invoker_marsrover_00N_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.NORTH);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(MarsRoverConstant.COMMAND_MOVE);
        invoker.execute();

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals(Direction.NORTH, marsRover.getDirection());
    }

    @Test
    void should_return_W_when_invoker_execute_given_invoker_marsrover_00N_L() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.NORTH);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(MarsRoverConstant.COMMAND_LEFT);
        invoker.execute();

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(Direction.WEST, marsRover.getDirection());
    }

    @Test
    void should_return_E_when_invoker_execute_given_invoker_marsrover_00N_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.NORTH);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(MarsRoverConstant.COMMAND_RIGHT);
        invoker.execute();

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(Direction.EAST, marsRover.getDirection());
    }

    @Test
    void should_return_S_when_invoker_execute_given_invoker_marsrover_00E_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.EAST);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(MarsRoverConstant.COMMAND_RIGHT);
        invoker.execute();

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(Direction.SOUTH, marsRover.getDirection());
    }

    @Test
    void should_return_N_when_invoker_execute_given_invoker_marsrover_00E_L() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.EAST);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(MarsRoverConstant.COMMAND_LEFT);
        invoker.execute();

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(Direction.NORTH, marsRover.getDirection());
    }

    @Test
    void should_return_x_plus_1_when_invoker_execute_given_invoker_marsrover_00E_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.EAST);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(MarsRoverConstant.COMMAND_MOVE);
        invoker.execute();

        //then
        assertEquals(1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(Direction.EAST, marsRover.getDirection());
    }

    @Test
    void should_return_y_minus_1_when_invoker_execute_given_invoker_marsrover_00S_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.SOUTH);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(MarsRoverConstant.COMMAND_MOVE);
        invoker.execute();

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(-1, marsRover.getLocationY());
        assertEquals(Direction.SOUTH, marsRover.getDirection());
    }

    @Test
    void should_return_E_when_invoker_execute_given_invoker_marsrover_00S_L() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.SOUTH);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(MarsRoverConstant.COMMAND_LEFT);
        invoker.execute();

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(Direction.EAST, marsRover.getDirection());
    }

    @Test
    void should_return_W_when_invoker_execute_given_invoker_marsrover_00S_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.SOUTH);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(MarsRoverConstant.COMMAND_RIGHT);
        invoker.execute();

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(Direction.WEST, marsRover.getDirection());
    }

    @Test
    void should_return_x_minus_1_when_invoker_execute_given_invoker_marsrover_00W_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.WEST);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(MarsRoverConstant.COMMAND_MOVE);
        invoker.execute();

        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(Direction.WEST, marsRover.getDirection());
    }

    @Test
    void should_return_N_when_invoker_execute_given_invoker_marsrover_00W_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.WEST);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(MarsRoverConstant.COMMAND_RIGHT);
        invoker.execute();

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(Direction.NORTH, marsRover.getDirection());
    }

    @Test
    void should_return_N_when_invoker_execute_given_invoker_marsrover_00W_L() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.WEST);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(MarsRoverConstant.COMMAND_LEFT);
        invoker.execute();

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(Direction.SOUTH, marsRover.getDirection());
    }


    @Test
    void should_return_minus_11N_when_invoker_execute_given_invoker_marsrover_00N_MLMR() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.NORTH);
        Invoker invoker = new Invoker(marsRover);

        //when
        String command = MarsRoverConstant.COMMAND_MOVE + MarsRoverConstant.COMMAND_LEFT + MarsRoverConstant.COMMAND_MOVE + MarsRoverConstant.COMMAND_RIGHT;
        invoker.receiveCommand(command);
        invoker.execute();

        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals(Direction.NORTH, marsRover.getDirection());
    }

}
