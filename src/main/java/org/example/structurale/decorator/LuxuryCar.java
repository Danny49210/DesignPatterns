package org.example.structurale.decorator;

public class LuxuryCar extends CarDecorator{

    private boolean premiumSeats;


    public LuxuryCar(Car car, boolean premiumSeats) {
        super(car);
        this.premiumSeats = premiumSeats;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Added luxury elements. Leather seats: " + premiumSeats);
    }

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LuxuryCar{");
        sb.append("premiumSeats=").append(premiumSeats);
        sb.append('}');
        return sb.toString();
    }
}
