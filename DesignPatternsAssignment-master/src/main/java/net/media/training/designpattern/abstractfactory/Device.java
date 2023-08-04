package net.media.training.designpattern.abstractfactory;

public interface Device {
    public  Case createCase();
    public  MotherBoard createMotherBoard();
    public  Processor createProcessor();
    public  Screen createScreen();
}