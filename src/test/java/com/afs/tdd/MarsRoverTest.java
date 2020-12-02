package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    public static final String TEST_COMMANDS_MLMR = "MLMR";

    @Test
    void should_return_y_plus_1_when_invoker_execute_given_invoker_mars_rover_00N_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, MarsRoverConstant.DIRECTION_NORTH);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(MarsRoverConstant.COMMAND_MOVE);
        invoker.execute();

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals(MarsRoverConstant.DIRECTION_NORTH, marsRover.getDirection());
    }

    @Test
    void should_return_W_when_invoker_execute_given_invoker_mars_rover_00N_L() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, MarsRoverConstant.DIRECTION_NORTH);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(MarsRoverConstant.COMMAND_LEFT);
        invoker.execute();

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(MarsRoverConstant.DIRECTION_WEST, marsRover.getDirection());
    }

    @Test
    void should_return_E_when_invoker_execute_given_invoker_mars_rover_00N_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, MarsRoverConstant.DIRECTION_NORTH);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(MarsRoverConstant.COMMAND_RIGHT);
        invoker.execute();

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(MarsRoverConstant.DIRECTION_EAST, marsRover.getDirection());
    }

    @Test
    void should_return_S_when_invoker_execute_given_invoker_mars_rover_00E_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, MarsRoverConstant.DIRECTION_EAST);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(MarsRoverConstant.COMMAND_RIGHT);
        invoker.execute();

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(MarsRoverConstant.DIRECTION_SOUTH, marsRover.getDirection());
    }

    @Test
    void should_return_N_when_invoker_execute_given_invoker_mars_rover_00E_L() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, MarsRoverConstant.DIRECTION_EAST);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(MarsRoverConstant.COMMAND_LEFT);
        invoker.execute();

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(MarsRoverConstant.DIRECTION_NORTH, marsRover.getDirection());
    }

    @Test
    void should_return_x_plus_1_when_invoker_execute_given_invoker_mars_rover_00E_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, MarsRoverConstant.DIRECTION_EAST);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(MarsRoverConstant.COMMAND_MOVE);
        invoker.execute();

        //then
        assertEquals(1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(MarsRoverConstant.DIRECTION_EAST, marsRover.getDirection());
    }

    @Test
    void should_return_y_minus_1_when_invoker_execute_given_invoker_mars_rover_00S_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, MarsRoverConstant.DIRECTION_SOUTH);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(MarsRoverConstant.COMMAND_MOVE);
        invoker.execute();

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(-1, marsRover.getLocationY());
        assertEquals(MarsRoverConstant.DIRECTION_SOUTH, marsRover.getDirection());
    }

    @Test
    void should_return_E_when_invoker_execute_given_invoker_mars_rover_00S_L() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, MarsRoverConstant.DIRECTION_SOUTH);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(MarsRoverConstant.COMMAND_LEFT);
        invoker.execute();

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(MarsRoverConstant.DIRECTION_EAST, marsRover.getDirection());
    }

    @Test
    void should_return_W_when_invoker_execute_given_invoker_mars_rover_00S_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, MarsRoverConstant.DIRECTION_SOUTH);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(MarsRoverConstant.COMMAND_RIGHT);
        invoker.execute();

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(MarsRoverConstant.DIRECTION_WEST, marsRover.getDirection());
    }

    @Test
    void should_return_x_minus_1_when_invoker_execute_given_invoker_mars_rover_00W_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, MarsRoverConstant.DIRECTION_WEST);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(MarsRoverConstant.COMMAND_MOVE);
        invoker.execute();

        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(MarsRoverConstant.DIRECTION_WEST, marsRover.getDirection());
    }

    @Test
    void should_return_N_when_invoker_execute_given_invoker_mars_rover_00W_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, MarsRoverConstant.DIRECTION_WEST);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(MarsRoverConstant.COMMAND_RIGHT);
        invoker.execute();

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(MarsRoverConstant.DIRECTION_NORTH, marsRover.getDirection());
    }

    @Test
    void should_return_N_when_invoker_execute_given_invoker_mars_rover_00W_L() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, MarsRoverConstant.DIRECTION_WEST);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(MarsRoverConstant.COMMAND_LEFT);
        invoker.execute();

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(MarsRoverConstant.DIRECTION_SOUTH, marsRover.getDirection());
    }

    //invoker shd only receive command
    // spilt command shd be on client
    @Test
    void should_return_minus_11N_when_invoker_execute_given_invoker_mars_rover_00N_MLMR() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, MarsRoverConstant.DIRECTION_NORTH);
        Invoker invoker = new Invoker(marsRover);

        //when
        invoker.receiveCommand(TEST_COMMANDS_MLMR);
        invoker.execute();

        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals(MarsRoverConstant.DIRECTION_NORTH, marsRover.getDirection());
    }

}
