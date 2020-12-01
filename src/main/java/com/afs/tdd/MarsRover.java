package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private Location location;

    public MarsRover(int locationX, int locationY, Direction direction) {
        location = new Location(locationX, locationY, direction);
    }

    public void executeCommands(String commands) {
        Arrays.asList(commands.split("")).forEach(cmd -> executeEachCommand(cmd));
    }

    public void executeEachCommand(String command) {
        if (command.equals(MarsRoverConstant.COMMAND_MOVE)) {
            this.moveForward();
        } else {
            this.changeDirection(command);
        }
    }

    public void changeDirection(String changeDirection) {
        if (changeDirection.equals(MarsRoverConstant.COMMAND_LEFT)) {
            location.turnLeft();
        } else if (changeDirection.equals(MarsRoverConstant.COMMAND_RIGHT)) {
            location.turnRight();
        }
    }


    public void moveForward() {
        if (location.getDirection().equals(Direction.NORTH)) {
            location.setLocationY(location.getLocationY() + 1);
        } else if (location.getDirection().equals(Direction.WEST)) {
            location.setLocationX(location.getLocationX() - 1);
        } else if (location.getDirection().equals(Direction.SOUTH)) {
            location.setLocationY(location.getLocationY() - 1);
        } else {
            location.setLocationX(location.getLocationX() + 1);
        }
    }

    public int getLocationX() {
        return location.getLocationX();
    }

    public int getLocationY() {
        return location.getLocationY();
    }

    public Direction getDirection() {
        return location.getDirection();
    }
}
