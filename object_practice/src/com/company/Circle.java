package com.company;

public class Circle {
    public int radius;

    public  Circle(){
        this.radius = 5;
    }

    public Circle(int radius){
        this.radius = radius;
    }

    //面積の計算
    public double getArea(){
        return (radius * radius * 3.14);
    }

    //円周の計算
    public double getCircumeference(){
        return (2*radius*3.14);
    }
}
