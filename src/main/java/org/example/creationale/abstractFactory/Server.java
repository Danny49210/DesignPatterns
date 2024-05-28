package org.example.creationale.abstractFactory;

public class Server extends Computer {

    private Integer ramPerUnit;
    private Integer hardDiskPerUnit;
    private Integer units;
    @Override
    public String getRam() {
        return "ram server: " + ramPerUnit * units;
    }

    @Override
    public String getHardDisk() {
        return "hardDisk server: " + hardDiskPerUnit * units;
    }

    public Server(Integer ramPerUnit, Integer hardDiskPerUnit, Integer units) {
        this.ramPerUnit = ramPerUnit;
        this.hardDiskPerUnit = hardDiskPerUnit;
        this.units = units;
    }
}
