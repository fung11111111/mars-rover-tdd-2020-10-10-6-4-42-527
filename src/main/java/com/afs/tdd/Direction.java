package com.afs.tdd;

public enum Direction {
    NORTH("N"),
    EAST("E"),
    WEST("W"),
    SOUTH("S");

    private final String direction;

    Direction(String direction) {
        this.direction = direction;
    }
}
