package com;

/**
 * Created by Ricardo on 08/06/2016.
 */
public class Triangle extends Figure{
    private float height;
    private float base;


    public float getHeight() {
        return height;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getBase() {
        return base;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public void call(Method method) {
        method.makeCalc(this);
    }
}
