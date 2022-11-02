package be.intecbrussel;

public class Car implements Motor, Switch, Horn{
    public Car(){

    }

    @Override
    public void makeSound() {
       // Horn.super.makeSound();
        System.out.println("honk honk");

    }

    @Override
    public void accelerate() {
        System.out.println("car is accelerating");
    }

    @Override
    public void decelerate() {
        System.out.println("car is decelerating");
    }

    @Override
    public void turnOn() {
        System.out.println("motor is turned on");

    }

    @Override
    public void turnOff() {
        System.out.println("motor is turned off");

    }
}
