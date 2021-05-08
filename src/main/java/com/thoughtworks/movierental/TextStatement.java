package com.thoughtworks.movierental;

public class TextStatement {
    String name;
    Rentals rentals;

    public TextStatement(String name, Rentals rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    public String statement() {
        String result = "Rental Record for " + name + "\n";
        for (Rental each : rentals) {
            result += "\t" + each.title() + "\t" +
                    each.amount() + "\n";
        }

        result += "Amount owed is " + rentals.totalAmount() + "\n";
        result += "You earned " + rentals.totalFrequentRenterPoints()
                + " frequent renter points";
        return result;
    }

}
