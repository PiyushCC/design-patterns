package net.media.training.designpattern.abstractfactory;

public class IphoneManufacturer implements Device {
    public Case createCase() {
        return new IphoneCase();
    }

    public MotherBoard createMotherBoard() {
        return new IphoneMotherBoard();
    }

    public Processor createProcessor() {
        return new IphoneProcessor();
    }

    public Screen createScreen() {
        return new IphoneScreen();
    }
}