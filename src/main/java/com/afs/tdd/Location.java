package com.afs.tdd;

import java.util.HashMap;
import java.util.Map;

public class Location {
    public static final int MOVEFORWARD = 1;
    public static final int MOVEBACKWORD = -1;
    private int locationX;
    private int locationY;
    private Direction direction;

    public Location(int locationX, int locationY, Direction direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void setLocationX(int locationX) {
        this.locationX = locationX;
    }

    public void setLocationY(int locationY) {
        this.locationY = locationY;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public Direction getDirection() {
        return direction;
    }

    public void turnLeft() {
        this.setDirection(getLeftTurnMapping().get(direction));
    }

    public void turnRight() {
        this.setDirection(getRightTurnMapping().get(direction));
    }

    public void moveForward() {
        this.getMoveForwardMapping().get(direction).run();
    }

    private Map<Direction, Direction> getLeftTurnMapping() {
        Map<Direction, Direction> turnLeftMap = new HashMap<>();
        turnLeftMap.put(Direction.EAST, Direction.NORTH);
        turnLeftMap.put(Direction.WEST, Direction.SOUTH);
        turnLeftMap.put(Direction.SOUTH, Direction.EAST);
        turnLeftMap.put(Direction.NORTH, Direction.WEST);
        return turnLeftMap;
    }

    private Map<Direction, Direction> getRightTurnMapping() {
        Map<Direction, Direction> turnRightMap = new HashMap<>();
        turnRightMap.put(Direction.EAST, Direction.SOUTH);
        turnRightMap.put(Direction.WEST, Direction.NORTH);
        turnRightMap.put(Direction.SOUTH, Direction.WEST);
        turnRightMap.put(Direction.NORTH, Direction.EAST);
        return turnRightMap;
    }

    private Map<Direction, Runnable> getMoveForwardMapping() {
        Map<Direction, Runnable> moveForwardMap = new HashMap<>();
        moveForwardMap.put(Direction.EAST, () -> this.locationX++);
        moveForwardMap.put(Direction.WEST, () -> this.locationX--);
        moveForwardMap.put(Direction.SOUTH, ()-> this.locationY--);
        moveForwardMap.put(Direction.NORTH, ()-> this.locationY++);
        return moveForwardMap;
    }
}
