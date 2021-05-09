package com.thoughtworks.movierental.movieType;

public class NewReleaseMovieType implements MovieType {
    int priceCode;

    public NewReleaseMovieType(int priceCode) {
        this.priceCode = priceCode;
    }

    public double amountFor(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int priceCode() {
        return priceCode;
    }

    @Override
    public int frequentRenterPointsFor(int daysRented) {
        int frequentRenterPoints = 1;
        if (daysRented > 1) frequentRenterPoints++;
        return frequentRenterPoints;
    }
}