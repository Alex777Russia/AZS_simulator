package com.company;

public class FuelTank {

    private static int MAXIM_VALUE_OF_OCCUPANCY = 1_000_000;
    private int occupancy;  // Occupancy of AZS

    public FuelTank(int occupancy) {
        this.occupancy = occupancy;
    }

    public int getOccupancy() { return occupancy; }

    public void addingFuel() {
        occupancy = MAXIM_VALUE_OF_OCCUPANCY;
    }

    public void filling(Vehicle vehicle) {
        occupancy -= vehicle.getDesireToFillIn();
    }

}
