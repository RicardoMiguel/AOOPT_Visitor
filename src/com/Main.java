package com;

public class Main {

    public static void main(String[] args) {
        Method s2 = new Scale(4);
        Method s3 = new Area();
        Figure[] figures={ new Triangle(), new Square(), new Circle()};

        for (Figure f: figures){
            f.call(s2);
            f.call(s3);
            System.out.println(f.getClass() + ": " + f.getArea());
        }

    }
}
