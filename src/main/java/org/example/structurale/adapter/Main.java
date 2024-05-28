package org.example.structurale.adapter;

public class Main {
    public static void main(String[] args) {
        Duck duck1 = new Duck();
        duck1.canFly();
        duck1.makeNoise();

        ToyDuck toyduck = new ToyDuck();
        toyduck.squeak();

        Sparrow sparrow = new Sparrow();
        sparrow.canFly();
        sparrow.makeNoise();

        BirdActionPlastic toySparrow = new BirdAdapter(sparrow);
        toySparrow.squeak();
    }
}
