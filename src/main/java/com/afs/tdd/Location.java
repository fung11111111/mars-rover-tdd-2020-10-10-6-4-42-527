package com.afs.tdd;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private int locationX;
    private int locationY;
    private Direction direction;
    private Map<Direction, Direction> turnLeftMap;
    private Map<Direction, Direction> turnRightMap;

    public Location(int locationX, int locationY, Direction direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
        turnLeftMap = new HashMap<>();
        turnRightMap = new HashMap<>();
        initializeTurningMap();
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

    public void turnLeft(){
        Direction newDirection = this.turnLeftMap.get(direction);
        this.setDirection(newDirection);
    }

    public void turnRight(){
        Direction newDirection = this.turnRightMap.get(direction);
        this.setDirection(newDirection);
    }

    public void moveForward(){

    }

    private void initializeTurningMap(){
        turnLeftMap.put(Direction.EAST, Direction.NORTH);
        turnLeftMap.put(Direction.WEST, Direction.SOUTH);
        turnLeftMap.put(Direction.SOUTH, Direction.EAST);
        turnLeftMap.put(Direction.NORTH, Direction.WEST);

        turnRightMap.put(Direction.EAST, Direction.SOUTH);
        turnRightMap.put(Direction.WEST, Direction.NORTH);
        turnRightMap.put(Direction.SOUTH, Direction.WEST);
        turnRightMap.put(Direction.NORTH, Direction.EAST);
    }
}
