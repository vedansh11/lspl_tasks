package DesignPatterns.Class;

import DesignPatterns.Interfaces.Implementations.FlyWithWings;
import DesignPatterns.Interfaces.Implementations.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quakBehaviour = new Quack();
        flyBehaviour =new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am real Mallard duck");
    }
}
