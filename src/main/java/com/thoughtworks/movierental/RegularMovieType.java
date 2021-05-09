package com.thoughtworks.movierental;

public class RegularMovieType {
    double amountFor(int daysRented) {
        double thisAmount = 2;
        if (daysRented > 2)
            thisAmount += (daysRented - 2) * 1.5;
        return thisAmount;
    }
}