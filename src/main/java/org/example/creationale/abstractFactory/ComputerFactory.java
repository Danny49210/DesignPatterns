package org.example.creationale.abstractFactory;


public class ComputerFactory {

    public static Computer createComputer(ComputerAbastractFactory computerAbastractFactory) {
        return computerAbastractFactory.createComputer();
    }
}
