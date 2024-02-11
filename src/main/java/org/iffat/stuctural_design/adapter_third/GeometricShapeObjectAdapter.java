package org.iffat.stuctural_design.adapter_third;

public class GeometricShapeObjectAdapter implements Shape {

    private GeometricShape adaptee;

    public GeometricShapeObjectAdapter(GeometricShape adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void draw() {
        adaptee.drawShape();
    }

    @Override
    public void resize() {
        System.out.println(description() + " can't be resized now!!");
    }

    @Override
    public String description() {
        if (adaptee instanceof Triangle) {
            return "Triangle Object";
        } else if (adaptee instanceof Rhombus) {
            return "Rhombus Object";
        } else {
            return "Unknown Object";
        }
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
