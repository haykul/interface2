package oefening;

public class Step implements Switch, Merk{


    @Override
    public void turnOn() {
        System.out.println("motor is turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("motor is turn off");

    }

    @Override
    public void type() {
        System.out.println("Tesla");
    }
}
