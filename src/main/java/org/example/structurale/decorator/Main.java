package org.example.structurale.decorator;

public class Main {
    public static void main(String[] args) {
        Car dacia = new BasicCar("red", 288);
        dacia.assemble();
        Car luxuryCar = new LuxuryCar(dacia,true);
        luxuryCar.assemble();
        Car sportLuxuryCar = new SportsCar(luxuryCar, 150);
        sportLuxuryCar.assemble();
        Car sandero = new BasicCar("green", 90);
        Car sportCar = new SportsCar(sandero, 90);
        sportCar.assemble();
    }
}
