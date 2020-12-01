package com.afs.tdd;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private int locationX;
    private int locationY;
    private String direction;

    public Location(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public String getDirection() {
        return direction;
    }

    public void turnLeft() {
        this.direction = getLeftTurnMapping().get(direction);
    }

    public void turnRight() {
        this.direction = getRightTurnMapping().get(direction);
    }

    public void moveForward() {
        this.getMoveForwardMapping().get(direction).run();
    }

    private Map<String, String> getLeftTurnMapping() {
        Map<String, String> turnLeftMap = new HashMap<>();
        turnLeftMap.put(MarsRoverConstant.DIRECTION_EAST, MarsRoverConstant.DIRECTION_NORTH);
        turnLeftMap.put(MarsRoverConstant.DIRECTION_WEST, MarsRoverConstant.DIRECTION_SOUTH);
        turnLeftMap.put(MarsRoverConstant.DIRECTION_SOUTH, MarsRoverConstant.DIRECTION_EAST);
        turnLeftMap.put(MarsRoverConstant.DIRECTION_NORTH, MarsRoverConstant.DIRECTION_WEST);
        return turnLeftMap;
    }

    private Map<String, String> getRightTurnMapping() {
        Map<String, String> turnRightMap = new HashMap<>();
        turnRightMap.put(MarsRoverConstant.DIRECTION_EAST, MarsRoverConstant.DIRECTION_SOUTH);
        turnRightMap.put(MarsRoverConstant.DIRECTION_WEST, MarsRoverConstant.DIRECTION_NORTH);
        turnRightMap.put(MarsRoverConstant.DIRECTION_SOUTH, MarsRoverConstant.DIRECTION_WEST);
        turnRightMap.put(MarsRoverConstant.DIRECTION_NORTH, MarsRoverConstant.DIRECTION_EAST);
        return turnRightMap;
    }

    private Map<String, Runnable> getMoveForwardMapping() {
        Map<String, Runnable> moveForwardMap = new HashMap<>();
        moveForwardMap.put(MarsRoverConstant.DIRECTION_EAST, () -> this.locationX++);
        moveForwardMap.put(MarsRoverConstant.DIRECTION_WEST, () -> this.locationX--);
        moveForwardMap.put(MarsRoverConstant.DIRECTION_SOUTH, () -> this.locationY--);
        moveForwardMap.put(MarsRoverConstant.DIRECTION_NORTH, () -> this.locationY++);
        return moveForwardMap;
    }
}
