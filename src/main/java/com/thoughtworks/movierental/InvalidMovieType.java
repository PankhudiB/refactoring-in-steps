package com.thoughtworks.movierental;

public class InvalidMovieType implements MovieType {
    public double amountFor(int daysRented) {
        return 0;
    }
}