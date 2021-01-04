package interfaces;

import org.junit.Test;

public class SportCar implements Vehicle,ManualVehicle,SportMode {

    @Override
    public void changeGear() {
        System.out.println("Sport car has changed the gear");
    }

    @Test
    @Override
    public void driveCar() {
        System.out.println("Sport car drive fast");
        final CarStatus carStatus = CarStatus.valueOf("TOPSPEED");
        System.out.println("aa" +carStatus.label);
    }

    @Override
    public void startEngine() {
        System.out.println("");
    }

    @Override
    public void applyBreaks() {

    }

    @Override
    public void vehicleSilencer(int number) {

    }

    @Override
    public void includePaddleShift() {

    }
}
