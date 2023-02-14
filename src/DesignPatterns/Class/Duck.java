package DesignPatterns.Class;

import DesignPatterns.Interfaces.FlyBehaviour;
import DesignPatterns.Interfaces.QuakBehaviour;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuakBehaviour quakBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuakBehaviour(QuakBehaviour quakBehaviour) {
        this.quakBehaviour = quakBehaviour;
    }

    public void swim(){
        System.out.println("Swimming");
    }
    public abstract void display();

    public void performquack(){
        quakBehaviour.quack();
    }
    public void performfly(){
        flyBehaviour.fly();
    }


}

    
