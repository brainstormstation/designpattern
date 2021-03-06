package com.designpattern.factorymethod;

public abstract class AbstractFactory {
    
    abstract Food createFood();

    abstract Vehicle createVehicle();

    abstract Weapon createWeapon();
}
