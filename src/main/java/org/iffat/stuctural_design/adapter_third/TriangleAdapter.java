package org.iffat.stuctural_design.adapter_third;

public class TriangleAdapter extends Triangle implements Shape{
    public TriangleAdapter(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public void draw() {
        this.drawShape();
    }

    @Override
    public void resize() {
        System.out.println("Triangle is not able to resize!!");
    }

    @Override
    public String description() {
        return "Triangle Object";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
