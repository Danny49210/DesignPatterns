package org.example.structurale.adapter;

public class BirdAdapter implements BirdActionPlastic{

    private BirdAction birdAction;

    public BirdAdapter(BirdAction birdAction) {
        this.birdAction = birdAction;
    }

    @Override
    public void squeak() {
        System.out.println("Toy with adapter: ");
        birdAction.makeNoise();
    }
}
