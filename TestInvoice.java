package com.bl.test;

import org.junit.Assert;
import org.junit.Test;
/**
 *
 * @auther : pranav gupta
 */

public class TestInvoice {

    Invoice invoice = new Invoice();
    @Test
    public void GivenDistanceAndTimeWhenCalculatedShouldReturnTotalFareCost(){
        double kilometers = 2.0;
        int minutes = 5;
        double fare = invoice.farePrize(kilometers,minutes);
        Assert.assertEquals(25,fare,0.0);
    }

    @Test
    public void GivenMinimumDistanceAndTimeShouldReturnMinimumFare() {
        double kilometers = 0.1;
        int minutes = 1;
        double fare = invoice.farePrize(kilometers,minutes);
        Assert.assertEquals(5,fare,0.0);
    }
    @Test
    public void GivenMultipleRidesShouldReturnTotalFare() {
        Ride[] rides = { new Ride(2.0, 5),
                         new Ride(0.1, 1) };
        double fare = invoice.totalFarePrize(rides);
        Assert.assertEquals(30, fare,0.0);
    }
    @Test
    public void GivenMultipleRidesShouldReturnInvoiceSummary() {
        Ride[] rides = { new Ride(2.0, 5),
                         new Ride(0.1, 1) };
        InvoiceSummary summary = invoice.invoiceSummary(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30);
        Assert.assertEquals(expectedInvoiceSummary, summary);
    }
}