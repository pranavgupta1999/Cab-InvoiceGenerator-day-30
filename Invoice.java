package com.bl.test;

public class Invoice {

    private static final double COST_PER_KILOMETER = 10;
    private static final int COST_PER_MINUTE = 1;
    private static final int MINIMUM_FARE = 5;

    public double calculateFare(double kilometers, int minutes) {
        double totalFare = MINIMUM_COST_PER_KILOMETER*kilometers + minute * COST_PER_MINUTE*minutes;
        if(totalFare < MINIMUM_FARE ) {
            return MINIMUM_FARE;
        }
        return totalFare;
    }
}