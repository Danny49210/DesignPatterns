package org.example.abstractFactory;

public class Main {
    public static void main(String[] args) {
        Computer server = ComputerFactory
                .createComputer(new ServerFactory(32, 512, 20));
        System.out.println(server.getRam());
        System.out.println(server.getHardDisk());

        Computer pc = ComputerFactory.createComputer(new PcFactory(56, 4096));
        System.out.println(pc.getHardDisk());
        System.out.println(pc.getRam());
    }
}
