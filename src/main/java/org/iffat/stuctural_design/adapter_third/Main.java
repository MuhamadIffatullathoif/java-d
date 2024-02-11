package org.iffat.stuctural_design.adapter_third;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.draw();

        GeometricShape gs1 = new Rhombus(2, 3);
        gs1.drawShape();

        Shape s2 = new GeometricShapeObjectAdapter(new Triangle(4, 2, 3));
        s2.draw();

        Shape s3 = new TriangleAdapter(4, 2, 3);
        s3.draw();
    }
}
