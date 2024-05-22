package org.example.adapter;

public class Duck implements BirdAction{

    @Override
    public void canFly() {
        System.out.println("Duck cannot fly!");
    }

    @Override
    public void makeNoise() {
        System.out.println("Quack quack!!!");
    }
}
