package com.thoughtworks.movierental;

public interface MovieType {
    public double amountFor(int daysRented);

    public int priceCode();

    public int frequentRenterPointsFor(int daysRented);
}
