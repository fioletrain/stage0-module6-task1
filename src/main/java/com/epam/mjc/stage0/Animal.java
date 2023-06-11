package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public String getColor() {
        return color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public String onePawOrNot() {
        if (numberOfPaws == 1){
            return "";
        }
        return "s";
    }

    public String isHasFurOrNot() {
        if(hasFur == true){
            return "a";
        }
        return "no";
    }

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    public String getDescription(){
        return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paw" + onePawOrNot() +
                " and " + isHasFurOrNot() + " fur.";
    }
}
