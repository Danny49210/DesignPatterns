package org.example.structurale.decorator;

public class BasicCar implements Car{

    private String color;
    private int breakHp;

    public BasicCar(String color, int breakHp) {
        this.color = color;
        this.breakHp = breakHp;
    }

    @Override
    public void assemble() {
        System.out.println("Preparing basic car, colored " + color + " with horsepower of: " + breakHp);
    }

    @Override
    public int changeHp(int value) {
        this.breakHp += value;
        return breakHp;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BasicCar{");
        sb.append("color='").append(color).append('\'');
        sb.append(", breakHp=").append(breakHp);
        sb.append('}');
        return sb.toString();
    }
}
