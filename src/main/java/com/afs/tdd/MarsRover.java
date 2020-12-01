package com.afs.tdd;

public class MarsRover {
    private Location location;

    public MarsRover(int locationX, int locationY, String direction) {
        this.location = new Location(locationX, locationY, direction);
    }

    public void turnLeft() {
        this.location.turnLeft();
    }

    public void turnRight() {
        this.location.turnRight();
    }

    public void moveForward() {
        this.location.moveForward();
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
