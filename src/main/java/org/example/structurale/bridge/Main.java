package org.example.structurale.bridge;

public class Main {
    public static void main(String[] args) {

        Shape shapeTriangle = new Triangle(new Red());
        shapeTriangle.applyShapeColor();

        Shape shapePentagon = new Pentagon(new Green());
        shapePentagon.applyShapeColor();

        Shape triangle2 = new Triangle(new Color() {
            @Override
            public void applyColor() {
                System.out.println("Mov");
            }
        });
        triangle2.applyShapeColor();
    }
}
