package com.thoughtworks.movierental;

import com.thoughtworks.movierental.movieType.*;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    MovieType movieType;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.movieType = movieType(priceCode);
    }

    public int getPriceCode() {
        return movieType.priceCode();
    }

    public void setPriceCode(int arg) {
        movieType = movieType(arg);
    }

    public String getTitle() {
        return title;
    }

    double amountFor(int daysRented) {
        return movieType.amountFor(daysRented);
    }

    private MovieType movieType(int priceCode) {
        MovieType movieType;
        switch (priceCode) {
            case REGULAR:
                movieType = new RegularMovieType(priceCode);
                break;
            case NEW_RELEASE:
                movieType = new NewReleaseMovieType(priceCode);
                break;
            case CHILDRENS:
                movieType = new ChildrenMovieType(priceCode);
                break;
            default:
                movieType = new InvalidMovieType(priceCode);
                break;
        }
        return movieType;
    }

    int frequentRenterPointsFor(int daysRented) {
        return movieType.frequentRenterPointsFor(daysRented);
    }
}