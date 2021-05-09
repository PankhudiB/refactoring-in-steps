package com.thoughtworks.movierental;

public class ChildrenMovieType implements MovieType {
    int priceCode;

    public ChildrenMovieType(int priceCode) {
        this.priceCode = priceCode;
    }

    public double amountFor(int daysRented) {
        double thisAmount = 1.5;
        if (daysRented > 3)
            thisAmount += (daysRented - 3) * 1.5;
        return thisAmount;
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