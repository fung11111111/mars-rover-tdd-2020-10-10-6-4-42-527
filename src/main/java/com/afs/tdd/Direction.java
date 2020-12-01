package com.afs.tdd;

public enum Direction {
    NORTH("N"),
    EAST("E"),
    WEST("w"),
    SOUTH("S");

    private final String direction;

    Direction(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}