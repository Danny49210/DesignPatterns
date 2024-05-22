package org.example.bridge;

public class Pentagon extends Shape{
    public Pentagon(Color color) {
        super(color);
    }

    @Override
    public void applyShapeColor() {
        System.out.print("The color is: ");
        color.applyColor();
    }
}
