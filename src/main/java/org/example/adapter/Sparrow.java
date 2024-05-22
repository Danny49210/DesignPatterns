package org.example.adapter;

public class Sparrow implements BirdAction{
    @Override
    public void canFly() {
        System.out.println("Sparrow can fly");
    }

    @Override
    public void makeNoise() {
        System.out.println("Piu piu");
    }
}
