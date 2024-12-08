package org.example;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Shape3DInterface[] shapes = new Shape3DInterface[10];

        Shape3DInterface[] possibleShapes = {
                new Sphere(1 + 9 * random.nextDouble()),
                new Cylinder(1 + 9 * random.nextDouble(), 5 + 15 * random.nextDouble()),
                new Cube(1 + 9 * random.nextDouble())
        };

        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = possibleShapes[random.nextInt(possibleShapes.length)];
        }

        for (Shape3DInterface shape : shapes) {
            System.out.println("Shape: " + shape);
            System.out.println("Surface Area: " + shape.surfaceArea());
            System.out.println("Volume: " + shape.volume());
            System.out.println();
        }
    }
}
