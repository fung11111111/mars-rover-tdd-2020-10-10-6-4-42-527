package com.afs.tdd;

public class MarsRover {
    private int locationX;
    private int locationY;
    private String direction;

    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void executeCommands(String commands){
        if(commands == "M" && direction == "N"){
            locationY += 1;
        }else if (commands == "M" && direction == "E"){
            locationX += 1;
        }else if (commands == "M" && direction == "S"){
            locationY -= 1;
        }else if (commands == "M" && direction == "W"){
            locationX -= 1;
        }
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
