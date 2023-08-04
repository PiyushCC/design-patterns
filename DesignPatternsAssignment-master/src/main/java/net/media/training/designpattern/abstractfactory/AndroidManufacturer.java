package net.media.training.designpattern.abstractfactory;

public class AndroidManufacturer implements Device {
    public Case createCase() {
        return new AndroidCase();
    }

    public MotherBoard createMotherBoard() {
        return new AndroidMotherBoard();
    }

    public Processor createProcessor() {
        return new AndroidProcessor();
    }

    public Screen createScreen() {
        return new AndroidScreen();
    }
}