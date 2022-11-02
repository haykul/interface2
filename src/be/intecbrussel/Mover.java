package be.intecbrussel;

public class Mover implements LawnMover{
    @Override
    public void adjustHeight(int height) {
        System.out.println("Height is adjusted to:"+height+"mm");
    }

    @Override
    public void accelerate() {
        System.out.println("Moving forward");

    }

    @Override
    public void decelerate() {
        System.out.println("Slowing down");

    }

    @Override
    public void turnOn() {
        System.out.println("Lawnmover is turned on, Start cutting de grass");

    }

    @Override
    public void turnOff() {
        System.out.println("Lawnmover is turned off, laat het gras maar groeien!!");

    }
}
