package com.company;

public class Main {

    public static void main(String[] args) {
	Circle maru5 = new Circle();

	System.out.println(maru5.radius);

	maru5.radius = 20;

	System.out.println(maru5.radius);

	System.out.println(maru5.getArea());

	System.out.println(maru5.getCircumference());
    }
}
