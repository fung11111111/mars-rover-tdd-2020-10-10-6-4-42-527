package com.afs.tdd;

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
    public void addLocationX(int locationX) {
        this.locationX += locationX;
    }

    public void addLocationY(int locationY) {
        this.locationY += locationY;
    }

    public void setDirection(String direction) {
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

}
