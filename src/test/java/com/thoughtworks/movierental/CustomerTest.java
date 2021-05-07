package com.thoughtworks.movierental;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
    @Test
    public void test() {

        int expected = 3;

        Assert.assertEquals(expected, 1 + 2);
    }

    @Test
    public void shouldGenerateStatementForCustomer() {
        Customer customer = new Customer("Pankhudi Bhosle");

        Movie batman = new Movie("Batman", Movie.REGULAR);
        Rental batmanRental = new Rental(batman, 3);

        Movie stuartLittle = new Movie("Stuart Little", Movie.CHILDRENS);
        Rental stuartLittleRental = new Rental(stuartLittle, 5);

        Movie starWars = new Movie("Star Wars", Movie.NEW_RELEASE);
        Rental starWarsRental = new Rental(starWars, 1);

        customer.addRental(batmanRental);
        customer.addRental(stuartLittleRental);
        customer.addRental(starWarsRental);

        String statement = customer.statement();
        Assert.assertEquals("Rental Record for Pankhudi Bhosle\n" +
                "\tBatman\t3.5\n" +
                "\tStuart Little\t4.5\n" +
                "\tStar Wars\t3.0\n" +
                "Amount owed is 11.0\n" +
                "You earned 3 frequent renter points", statement);
    }

    @Test
    public void shouldGenerateHTMLStatementForCustomer() {
        Customer customer = new Customer("Pankhudi Bhosle");

        Movie batman = new Movie("Batman", Movie.REGULAR);
        Rental batmanRental = new Rental(batman, 3);

        Movie stuartLittle = new Movie("Stuart Little", Movie.CHILDRENS);
        Rental stuartLittleRental = new Rental(stuartLittle, 5);

        Movie starWars = new Movie("Star Wars", Movie.NEW_RELEASE);
        Rental starWarsRental = new Rental(starWars, 1);

        customer.addRental(batmanRental);
        customer.addRental(stuartLittleRental);
        customer.addRental(starWarsRental);

        String statement = customer.htmlStatement();
        Assert.assertEquals("<h3>Rental Record for Pankhudi Bhosle</h3><br/>" +
                "<p>Batman<b>3.5</b><br/>" +
                "Stuart Little<b>4.5</b><br/>" +
                "Star Wars<b>3.0</b><br/>" +
                "</p><p>Amount owed is <b>11.0</b></p><br/>" +
                "<p>You earned <b>3</b> frequent renter points</p>", statement);
    }

}