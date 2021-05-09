package com.thoughtworks.movierental;

public class InvalidMovieType implements MovieType {
    int priceCode;

    public InvalidMovieType(int priceCode) {
        this.priceCode = priceCode;
    }

    public double amountFor(int daysRented) {
        return 0;
    }

    @Override
    public int priceCode() {
        return priceCode;
    }

    @Override
    public int frequentRenterPointsFor(int daysRented) {
        return 1;
    }
}