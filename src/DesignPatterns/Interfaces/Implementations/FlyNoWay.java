package DesignPatterns.Interfaces.Implementations;

import DesignPatterns.Interfaces.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("It cant fly");
    }
}
