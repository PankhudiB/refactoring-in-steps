package com.thoughtworks.movierental;

public class ChildrenMovieType implements MovieType {
    public double amountFor(int daysRented) {
        double thisAmount = 1.5;
        if (daysRented > 3)
            thisAmount += (daysRented - 3) * 1.5;
        return thisAmount;
    }
}