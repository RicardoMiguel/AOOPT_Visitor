package com;

/**
 * Created by Ricardo on 08/06/2016.
 */
public class Scale extends Method{
    private float newScale;

    public Scale(float newScale) {
        this.newScale = newScale;
    }

    @Override
    public void makeCalc(Circle circle) {
        circle.setDiameter(newScale);
    }

    @Override
    public void makeCalc(Triangle figure) {
        figure.setHeight(newScale);
        figure.setBase(newScale);
    }

    @Override
    public void makeCalc(Square figure) {
        figure.setSide(newScale);
    }
}
