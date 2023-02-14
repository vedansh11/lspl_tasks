package DesignPatterns.Class;

import DesignPatterns.Interfaces.Implementations.FlyWithWings;
import DesignPatterns.Interfaces.Implementations.Quack;

public class RedHeadDuck extends Duck{
    public RedHeadDuck() {
        quakBehaviour=new Quack();
        flyBehaviour =new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am redhead duck");
    }
}
