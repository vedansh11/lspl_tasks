package DesignPatterns.Class;

import DesignPatterns.Interfaces.Implementations.FlyNoWay;
import DesignPatterns.Interfaces.Implementations.Squeak;

public class RubberDuck extends Duck{

    @Override
    public void display() {
        System.out.println("I am rubber duck");
    }

    public RubberDuck() {
        quakBehaviour= new Squeak();
        flyBehaviour=new FlyNoWay();
    }
}
