package DesignPatterns.Interfaces.Implementations;

import DesignPatterns.Interfaces.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I am flying with a Rocket!");
    }
}
