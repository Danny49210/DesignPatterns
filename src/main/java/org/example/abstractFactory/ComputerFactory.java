package org.example.abstractFactory;


public class ComputerFactory {

    public static Computer createComputer(ComputerAbastractFactory computerAbastractFactory) {
        return computerAbastractFactory.createComputer();
    }
}
