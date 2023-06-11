package com.epam.mjc.stage0;


public class Bird extends Animal {
    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paw" + onePawOrNot() +
                " and " + isHasFurOrNot() + " fur. Moreover, it has 2 wings and can fly.";
    }
}
