package be.intecbrussel;
//interface aggregation
public interface LawnMover extends Switch, Motor{
    void adjustHeight(int height);
}
