package com.thoughtworks.movierental;

public class NewReleaseMovieType {
    double amountFor(int daysRented) {
        return daysRented * 3;
    }

}