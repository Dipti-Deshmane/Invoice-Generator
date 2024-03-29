package com.bl.invoicegenerator;

public class InvoiceGenerator {
    private static final int costPerTime = 1;
    private static final double minimumCostPerKm = 10;
    private static final double minimumFare = 5;

    public double calculateFare(double distance, int time) {
        double totalFare = distance * minimumCostPerKm + time * costPerTime;
        if (totalFare < minimumFare) {
            return minimumFare;
        }
        return totalFare;
    }   
}
