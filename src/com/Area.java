package com;

/**
 * Created by Ricardo on 08/06/2016.
 */
public class Area extends Method{

    @Override
    public void makeCalc(Circle circle) {
        float side = circle.getDiameter()/2;
        circle.setArea((float)Math.PI * side * side);
    }

    @Override
    public void makeCalc(Triangle figure) {
        figure.setArea((figure.getBase() * figure.getHeight()) / 2);
    }

    @Override
    public void makeCalc(Square figure) {
        float side = figure.getSide();
        figure.setArea(side * side);
    }
}
