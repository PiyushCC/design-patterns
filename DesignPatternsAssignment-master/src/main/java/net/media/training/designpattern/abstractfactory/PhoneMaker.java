package net.media.training.designpattern.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:34:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhoneMaker {

    public static Case buildPhone(Device device) {
        
        MotherBoard motherBoard = device.createMotherBoard();
        motherBoard.attachBattery(new Battery());
        motherBoard.attachProcessor(device.createProcessor());

        Screen screen = device.createScreen();

        Case phoneCase = device.createCase();
        phoneCase.attachMotherBoard(motherBoard);
        phoneCase.attachScreen(screen);
        return phoneCase;
    }
}

// Usage:
// AndroidManufacturer samsungManufacturer = new AndroidManufacturer();
// PhoneMaker.buildPhone(samsungManufacturer);

