package DesignPatterns.Interfaces.Implementations;

import DesignPatterns.Interfaces.QuakBehaviour;

//Concrete implementation class:- A concrete class is a class that has an implementation for all of its methods.
// They cannot have any unimplemented methods.
// It can also extend an abstract class or implement an interface as long as it implements all their methods
// Here Quack,FlyNoWay,FlywithWings,Squeak,MuteSqueak are the concrete implmentation classes
public class Quack implements QuakBehaviour {

    @Override
    public void quack() {
        System.out.println("Duck quacking");
    }
}
