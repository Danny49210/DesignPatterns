package org.example.structurale.decorator;

public class CarDecorator implements Car{

    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        car.assemble();
    }

    @Override
    public int changeHp(int value) {
        return car.changeHp(value);
    }
}
