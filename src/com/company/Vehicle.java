package com.company;

public class Vehicle {

    private int volume;   // Max Volume
    private int percentageOfOccupancy;  //
    private double desireToFillIn;  //
    private double waitingTime;  //

    Vehicle (int volume, int percentageOfOccupancy, double desireToFillIn, double waitingTime) {
        if (percentageOfOccupancy + desireToFillIn > volume) {
            this.volume = volume;
            this.percentageOfOccupancy = percentageOfOccupancy;
            this.desireToFillIn = volume - percentageOfOccupancy;
        } else {
            this.volume = volume;
            this.percentageOfOccupancy = percentageOfOccupancy;
            this.desireToFillIn = desireToFillIn;
            this.waitingTime = waitingTime;
        }
    }

    public int getVolume() { return volume; }
    public int getPercentageOfOccupancy() { return percentageOfOccupancy; }
    public double getDesireToFillIn() { return desireToFillIn; }
    public double getWaitingTime() { return waitingTime; }

}
