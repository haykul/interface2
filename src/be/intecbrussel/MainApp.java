package be.intecbrussel;

public class MainApp {
    public static void main(String[]args){
        Car car1=new Car();
        car1.makeSound();
        car1.turnOn();
        car1.accelerate();
        Mover mover=new Mover();
        mover.turnOn();
        mover.accelerate();
        mover.decelerate();
        mover.turnOff();
        mover.adjustHeight(10);
    // OPdracht: Maak een class "Step" en  een class "ElectricStep
        // denk na over de nodig interfaces, of maak extra interfaces aan.

    }

}
