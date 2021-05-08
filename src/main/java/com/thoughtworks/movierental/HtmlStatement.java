package com.thoughtworks.movierental;

public class HtmlStatement {
    private static final String H3_OPEN_TAG = "<h3>";
    private static final String H3_CLOSING_TAG = "</h3>";
    private static final String BOLD_OPEN_TAG = "<b>";
    private static final String BOLD_CLOSING_TAG = "</b>";
    private static final String PARAGRAPH_OPEN_TAG = "<p>";
    private static final String PARAGRAPH_CLOSE_TAG = "</p>";
    private static final String LINE_BREAK_TAG = "<br/>";

    String name;
    Rentals rentals;

    public HtmlStatement(String name, Rentals rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    public String statement() {
        String result = H3_OPEN_TAG + "Rental Record for " + name + H3_CLOSING_TAG + LINE_BREAK_TAG;
        result += PARAGRAPH_OPEN_TAG;
        for (Rental rental : rentals) {
            result += rental.getMovie().getTitle() + BOLD_OPEN_TAG + rental.amount() + BOLD_CLOSING_TAG + LINE_BREAK_TAG;
        }
        result += PARAGRAPH_CLOSE_TAG;
        int totalFrequentRenterPoints = rentals.totalFrequentRenterPoints();
        result += PARAGRAPH_OPEN_TAG + "Amount owed is " + BOLD_OPEN_TAG + rentals.totalAmount() + BOLD_CLOSING_TAG + PARAGRAPH_CLOSE_TAG + LINE_BREAK_TAG;
        result += PARAGRAPH_OPEN_TAG + "You earned " + BOLD_OPEN_TAG + totalFrequentRenterPoints + BOLD_CLOSING_TAG + " frequent renter points" + PARAGRAPH_CLOSE_TAG;
        return result;
    }
}
