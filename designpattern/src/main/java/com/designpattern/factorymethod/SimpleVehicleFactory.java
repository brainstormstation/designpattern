package com.designpattern.factorymethod;

public class SimpleVehicleFactory {
    public Car createCar() {
        return new Car();
    }

    public Plane createPlane() {
        return new Plane();
    }
}
