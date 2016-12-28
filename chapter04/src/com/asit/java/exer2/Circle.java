package com.asit.java.exer2;

public class Circle {
	private double radius;
	
	public Circle(){
		radius = 1;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	//Ô²µÄÃæ»ı
	public double findArea(){
		return Math.PI * radius * radius;
	}
}
