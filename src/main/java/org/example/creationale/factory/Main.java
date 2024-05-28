package org.example.creationale.factory;

public class Main {
    public static void main(String[] args) {
        Pc pc = new Pc(32, 2048);
        System.out.println(pc.getRam());
        System.out.println(pc.getHardDisk());

        Server server = new Server(256, 10240, 3);
        System.out.println(server.getRam());
        System.out.println(server.getHardDisk());

        Computer pc2 = new Pc(16, 512);
        Computer server2 = new Server(16, 4096, 1);
        System.out.println(pc2.getRam());
        System.out.println(server2.getRam());

//        Computer server3 = ComputerFactory.createComputer("server", 512, 10240);
//        System.out.println(server3.getRam());

        Computer pc3 = ComputerFactory.createComputer("pc", 28, 128);
        System.out.println(pc3.getHardDisk());
    }
}
