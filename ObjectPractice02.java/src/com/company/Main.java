package com.company;

public class Main {

    public static void main(String[] args) {
        Circle radius10 = new Circle(10);
        double result_area =  radius10.getArea();
        double result_cicumference =  radius10.getCircumference();

        //面積の表示
        System.out.println(result_area);

        //直径の表示
        System.out.println(result_cicumference);
    }
}
