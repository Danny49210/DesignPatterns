package org.example.creationale.abstractFactory;

public class ServerFactory implements ComputerAbastractFactory {
    private Integer ram;
    private Integer hardDisk;
    private Integer units;


    public ServerFactory(Integer ram, Integer hardDisk, Integer units) {
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.units = units;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram, hardDisk, units);
    }
}
