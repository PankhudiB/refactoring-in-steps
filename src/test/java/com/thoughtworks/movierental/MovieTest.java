package com.thoughtworks.movierental;

import org.junit.Assert;
import org.junit.Test;

public class MovieTest {
    @Test
    public void shouldReturnRegularMovieAmount() {
        Movie movie = new Movie("Winnie the Pooh", Movie.REGULAR);
        double actual = movie.amountFor(3);
        Assert.assertEquals(3.5, actual, 0.0001);
    }

    @Test
    public void shouldReturnNewReleaseMovieAmount() {
        Movie movie = new Movie("Disciple", Movie.NEW_RELEASE);
        double actual = movie.amountFor(3);
        Assert.assertEquals(9.0, actual, 0.0001);
    }

    @Test
    public void shouldReturnChildrenMovieAmount() {
        Movie movie = new Movie("Harry Potter", Movie.CHILDRENS);
        double actual = movie.amountFor(3);
        Assert.assertEquals(1.5, actual, 0.0001);
    }

    @Test
    public void shouldReturnAnyOtherMovieAmount() {
        Movie movie = new Movie("Random", 7);
        double actual = movie.amountFor(3);
        Assert.assertEquals(0.0, actual, 0.0001);
    }

    @Test
    public void shouldReturnRegularMovieRenterPoints() {
        Movie movie = new Movie("Disciple", Movie.REGULAR);
        int actual = movie.frequentRenterPointsFor(3);
        Assert.assertEquals(1, actual);
    }

    @Test
    public void shouldReturnNewReleaseMovieRenterPoints() {
        Movie movie = new Movie("Disciple", Movie.NEW_RELEASE);
        int actual = movie.frequentRenterPointsFor(3);
        Assert.assertEquals(2, actual);
    }

    @Test
    public void shouldReturnChildrenMovieRenterPoints() {
        Movie movie = new Movie("Harry Potter", Movie.CHILDRENS);
        int actual = movie.frequentRenterPointsFor(3);
        Assert.assertEquals(1, actual);
    }

    @Test
    public void shouldReturnAnyOtherMovieRenterPoints() {
        Movie movie = new Movie("Random", 7);
        int actual = movie.frequentRenterPointsFor(3);
        Assert.assertEquals(1, actual);
    }
}