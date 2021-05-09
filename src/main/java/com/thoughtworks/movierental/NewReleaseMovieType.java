package com.thoughtworks.movierental;

public class NewReleaseMovieType implements MovieType {
    public double amountFor(int daysRented) {
        return daysRented * 3;
    }

}