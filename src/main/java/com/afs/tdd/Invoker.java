package com.afs.tdd;

import java.util.ArrayList;
import java.util.Arrays;

public class Invoker {
    private MarsRover marsRover;
    private ArrayList<Command> commands;

    public Invoker(MarsRover marsRover) {
        this.marsRover = marsRover;
        commands = new ArrayList<>();
    }

    // shd only receiveCommand
    public void receiveCommand(String commands) {
        Arrays.asList(commands.split("")).forEach(command -> {
            switch (command){
                case MarsRoverConstant.COMMAND_LEFT:
                    this.commands.add(new TurnLeft());
                    break;
                case MarsRoverConstant.COMMAND_RIGHT:
                    this.commands.add(new TurnRight());
                    break;
                case MarsRoverConstant.COMMAND_MOVE:
                    this.commands.add(new MoveForward());
                    break;
            }
        });
    }

    public void execute() {
        commands.stream().forEach(command -> command.execute(this.marsRover));
    }

}
