package com;

/**
 * Created by Ricardo on 08/06/2016.
 */
public class Square extends Figure {
    private float side;

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public void call(Method method) {
        method.makeCalc(this);
    }


}
