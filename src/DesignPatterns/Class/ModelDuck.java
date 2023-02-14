package DesignPatterns.Class;

import DesignPatterns.Interfaces.Implementations.FlyNoWay;
import DesignPatterns.Interfaces.Implementations.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quakBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model Duck");
    }
}
