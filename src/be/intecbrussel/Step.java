package be.intecbrussel;

public class Step implements AnalogVehicle, Horn{
    @Override
    public void makeSound() {
        System.out.println("ping ping");
    }
}
