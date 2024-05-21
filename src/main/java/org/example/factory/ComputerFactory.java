package org.example.factory;

import java.util.Scanner;

public class ComputerFactory {

    public static Computer createComputer(String computerType, Integer memory, Integer storage) {
        if ("pc".equals(computerType.toLowerCase())) {
            return new Pc(memory, storage);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add unit count:");
        Integer unitCount = scanner.nextInt();
        return new Server(memory, storage, unitCount);
    }
}
