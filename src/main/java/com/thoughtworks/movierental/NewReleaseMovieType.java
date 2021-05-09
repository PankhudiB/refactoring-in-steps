package com.thoughtworks.movierental;

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

}