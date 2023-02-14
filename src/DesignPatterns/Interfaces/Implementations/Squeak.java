package DesignPatterns.Interfaces.Implementations;

import DesignPatterns.Interfaces.QuakBehaviour;

public class Squeak implements QuakBehaviour {
    @Override
    public void quack() {
        System.out.println("Rubber duckie squeaks");
    }
}
