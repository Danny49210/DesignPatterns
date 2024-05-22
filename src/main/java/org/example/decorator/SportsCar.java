package org.example.decorator;

public class SportsCar extends CarDecorator{

    private int addedHp;

    public SportsCar(Car car, int addedHp) {
        super(car);
        this.addedHp = addedHp;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Added sport elements. New horse power:" + super.car.changeHp(addedHp));
    }

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SportsCar{");
        sb.append("addedHp=").append(addedHp);
        sb.append('}');
        return sb.toString();
    }
}

