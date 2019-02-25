package com.company;

public class Main {

    public static void main(String[] args) {
	Circle radius5 = new Circle();
    System.out.println(radius5.radius);
    double area5 = radius5.getArea();
    double circumeference = radius5.getCircumeference();

    System.out.println(area5);
    System.out.println(circumeference);
    }
}
