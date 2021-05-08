package com.thoughtworks.movierental;

public class Customer {
    private static final String H3_OPEN_TAG = "<h3>";
    private static final String H3_CLOSING_TAG = "</h3>";
    private static final String BOLD_OPEN_TAG = "<b>";
    private static final String BOLD_CLOSING_TAG = "</b>";
    private static final String PARAGRAPH_OPEN_TAG = "<p>";
    private static final String PARAGRAPH_CLOSE_TAG = "</p>";
    private static final String LINE_BREAK_TAG = "<br/>";

    private String name;
    private Rentals rentals = new Rentals();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        for (Rental each : rentals) {
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    each.amount() + "\n";
        }
        int totalFrequentRenterPoints = totalFrequentRenterPoints();
        result += "Amount owed is " + totalAmount() + "\n";
        result += "You earned " + totalFrequentRenterPoints
                + " frequent renter points";
        return result;
    }

    public String htmlStatement() {
        String result = H3_OPEN_TAG + "Rental Record for " + getName() + H3_CLOSING_TAG + LINE_BREAK_TAG;
        result += PARAGRAPH_OPEN_TAG;
        for (Rental each : rentals) {
            result += each.getMovie().getTitle() + BOLD_OPEN_TAG + each.amount() + BOLD_CLOSING_TAG + LINE_BREAK_TAG;
        }
        result += PARAGRAPH_CLOSE_TAG;
        int totalFrequentRenterPoints = totalFrequentRenterPoints();
        result += PARAGRAPH_OPEN_TAG + "Amount owed is " + BOLD_OPEN_TAG + totalAmount() + BOLD_CLOSING_TAG + PARAGRAPH_CLOSE_TAG + LINE_BREAK_TAG;
        result += PARAGRAPH_OPEN_TAG + "You earned " + BOLD_OPEN_TAG + totalFrequentRenterPoints + BOLD_CLOSING_TAG + " frequent renter points" + PARAGRAPH_CLOSE_TAG;
        return result;
    }

    private int totalFrequentRenterPoints() {
        int totalFrequentRenterPoints = 0;
        for (Rental rental : rentals) {
            totalFrequentRenterPoints += rental.frequentRenterPoints();
        }
        return totalFrequentRenterPoints;
    }

    private double totalAmount() {
        double totalAmount = 0;
        for (Rental rental : rentals) {
            totalAmount += rental.amount();
        }
        return totalAmount;
    }
}

