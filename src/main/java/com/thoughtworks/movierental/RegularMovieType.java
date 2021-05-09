package com.thoughtworks.movierental;

public class RegularMovieType implements MovieType {
    int priceCode;

    public RegularMovieType(int priceCode) {
        this.priceCode = priceCode;
    }

    public double amountFor(int daysRented) {
        double thisAmount = 2;
        if (daysRented > 2)
            thisAmount += (daysRented - 2) * 1.5;
        return thisAmount;
    }

    public int priceCode() {
        return priceCode;
    }

    @Override
    public int frequentRenterPointsFor(int daysRented) {
        return 1;
    }
}