package com.afs.tdd;

import java.util.HashMap;
import java.util.Map;

public class MarsRover {
    public static final String DIRECTION_NORTH = "N";
    public static final String DIRECTION_EAST = "E";
    public static final String DIRECTION_WEST = "W";
    public static final String DIRECTION_SOUTH = "S";
    private Location location;

    public MarsRover(int locationX, int locationY, String direction) {
        location = new Location(locationX, locationY, direction);

    }

    public void executeCommands(String commands) {
        executeEachCommand(commands);
    }

    public void executeEachCommand(String command) {
        if (command.equals("M")) {
            this.moveForward();
        } else {
            this.changeDirection(command);
        }
    }

    public void changeDirection(String changeDirection) {
        if(changeDirection.equals("L")){
            turnLeft();
        }else{
            turnRight();
        }
    }
    public void turnLeft(){
        if(location.getDirection().equals(DIRECTION_NORTH)){
            location.setDirection(DIRECTION_WEST);
        }else if(location.getDirection().equals(DIRECTION_WEST)){
            location.setDirection(DIRECTION_SOUTH);
        }else if(location.getDirection().equals(DIRECTION_SOUTH)){
            location.setDirection(DIRECTION_EAST);
        }else{
            location.setDirection(DIRECTION_NORTH);
        }
    }
    public void turnRight(){
        if(location.getDirection().equals(DIRECTION_NORTH)){
            location.setDirection(DIRECTION_EAST);
        }else if(location.getDirection().equals("W")){
            location.setDirection(DIRECTION_NORTH);
        }else if(location.getDirection().equals(DIRECTION_SOUTH)){
            location.setDirection(DIRECTION_WEST);
        }else{
            location.setDirection(DIRECTION_SOUTH);
        }
    }


    public void moveForward() {
        if(location.getDirection().equals(DIRECTION_NORTH)){
            location.addLocationY(1);
        }else if(location.getDirection().equals(DIRECTION_WEST)){
            location.addLocationX(-1);
        }else if(location.getDirection().equals(DIRECTION_SOUTH)){
            location.addLocationY(-1);
        }else{
            location.addLocationX(1);
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
