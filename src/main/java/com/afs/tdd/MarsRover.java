package com.afs.tdd;

public class MarsRover {
    private Location location;
// can be invoker
    public MarsRover(int locationX, int locationY, String direction) {
        this.location = new Location(locationX, locationY, direction);
    }

    public void turnLeft() {
        this.location.leftDirection();
    }

    public void turnRight() {
        this.location.rightDirection();
    }

    public void moveForward() {
        this.location.nextCoordinate();
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
