package com.afs.tdd;

import java.util.ArrayList;

public class Invoker {
    private MarsRover marsRover;
    private ArrayList<Command> commands;

    public Invoker(MarsRover marsRover) {
        this.marsRover = marsRover;
        commands = new ArrayList<>();
    }

    public void receiveCommand(Command command) {
        this.commands.add(command);
    }

    public void execute() {
        commands.stream().forEach(command -> command.execute(this.marsRover));
    }

}
