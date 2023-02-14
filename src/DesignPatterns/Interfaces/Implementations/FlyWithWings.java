package DesignPatterns.Interfaces.Implementations;

import DesignPatterns.Interfaces.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public  void fly() {
        System.out.println("Duck flying with wings");
    }
}
