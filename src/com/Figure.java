package com;

/**
 * Created by Ricardo on 08/06/2016.
 */
public abstract class Figure {
    protected float area;

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public abstract void call(Method method);

}
