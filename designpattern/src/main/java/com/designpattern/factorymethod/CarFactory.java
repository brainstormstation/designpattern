package com.designpattern.factorymethod;

public class CarFactory {
    public IMoveable createCar() {
        System.out.println("The car is creaing!");
        return new Car();
    }
    
}
