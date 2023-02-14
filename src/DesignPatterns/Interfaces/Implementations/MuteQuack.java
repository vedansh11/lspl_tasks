package DesignPatterns.Interfaces.Implementations;

import DesignPatterns.Interfaces.QuakBehaviour;

public class MuteQuack implements QuakBehaviour {
    @Override
    public void quack() {
        System.out.println("It cant quack");
    }
}
