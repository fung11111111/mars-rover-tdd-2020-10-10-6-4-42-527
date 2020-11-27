package com.afs.tdd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MarsRover {

    private Location location;

    public MarsRover(int locationX, int locationY, String direction) {
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
            turnLeft();
        } else if (changeDirection.equals(MarsRoverConstant.COMMAND_RIGHT)){
            turnRight();
        }
    }

    public void turnLeft() {
        if (location.getDirection().equals(MarsRoverConstant.DIRECTION_NORTH)) {
            location.setDirection(MarsRoverConstant.DIRECTION_WEST);
        } else if (location.getDirection().equals(MarsRoverConstant.DIRECTION_WEST)) {
            location.setDirection(MarsRoverConstant.DIRECTION_SOUTH);
        } else if (location.getDirection().equals(MarsRoverConstant.DIRECTION_SOUTH)) {
            location.setDirection(MarsRoverConstant.DIRECTION_EAST);
        } else {
            location.setDirection(MarsRoverConstant.DIRECTION_NORTH);
        }
    }

    public void turnRight() {
        if (location.getDirection().equals(MarsRoverConstant.DIRECTION_NORTH)) {
            location.setDirection(MarsRoverConstant.DIRECTION_EAST);
        } else if (location.getDirection().equals(MarsRoverConstant.DIRECTION_WEST)) {
            location.setDirection(MarsRoverConstant.DIRECTION_NORTH);
        } else if (location.getDirection().equals(MarsRoverConstant.DIRECTION_SOUTH)) {
            location.setDirection(MarsRoverConstant.DIRECTION_WEST);
        } else {
            location.setDirection(MarsRoverConstant.DIRECTION_SOUTH);
        }
    }


    public void moveForward() {
        if (location.getDirection().equals(MarsRoverConstant.DIRECTION_NORTH)) {
            location.setLocationY(location.getLocationY()+1);
        } else if (location.getDirection().equals(MarsRoverConstant.DIRECTION_WEST)) {
            location.setLocationX(location.getLocationX()-1);
        } else if (location.getDirection().equals(MarsRoverConstant.DIRECTION_SOUTH)) {
            location.setLocationY(location.getLocationY()-1);
        } else {
            location.setLocationX(location.getLocationX()+1);
        }
    }

    public int getLocationX() {
        return location.getLocationX();
    }

    public int getLocationY() {
        return location.getLocationY();
    }

    public String getDirection() {
        return location.getDirection();
    }
}
