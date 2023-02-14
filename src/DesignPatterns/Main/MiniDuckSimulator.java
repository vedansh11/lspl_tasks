package DesignPatterns.Main;

import DesignPatterns.Class.Duck;
import DesignPatterns.Class.MallardDuck;
import DesignPatterns.Class.ModelDuck;
import DesignPatterns.Class.RubberDuck;
import DesignPatterns.Interfaces.Implementations.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performquack();
        mallard.performfly();

        Duck redheadduck = new RubberDuck();
        redheadduck.display();
        redheadduck.performquack();
        redheadduck.performfly();

        Duck model =  new ModelDuck();
        model.performfly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performfly();


    }



}
