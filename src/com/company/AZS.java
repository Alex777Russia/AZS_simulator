package com.company;

public class AZS {

    private Column[] columns;
    private Vehicle[] vehicles;

    private FuelTank fuelTank;

    public AZS(FuelTank fuelTank, Column column, Vehicle vehicle) {
        this.columns[0] = column;
        this.vehicles[0] = vehicle;
        this.fuelTank = fuelTank;
    }

    public void refuelTheCar(Vehicle[] vehicles, Column[] columns, FuelTank fuelTank) {
        for (int i = 0; i < columns.length; ++i) {
            if (vehicles[i].getDesireToFillIn() <= fuelTank.getOccupancy()) {
                fuelTank.filling(vehicles[i]);
            } else {
                fuelTank.addingFuel();
                fuelTank.filling(vehicles[i]);
            }
        }
    }






}
