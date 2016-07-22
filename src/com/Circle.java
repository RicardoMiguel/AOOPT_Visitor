package com;

/**
 * Created by Ricardo on 08/06/2016.
 */
public class Circle extends Figure{

    private float diameter;


    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    @Override
    public void call(Method method) {
        method.makeCalc(this);
    }
}
