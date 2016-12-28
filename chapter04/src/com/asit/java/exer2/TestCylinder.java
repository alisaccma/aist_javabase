package com.asit.java.exer2;

public class TestCylinder {

	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		
		double volume = c.findVolume();
		System.out.println(volume);//默认值
		
		c.setRadius(2.3);
		c.setLength(1.2);
		System.out.println(c.findVolume());
		
		double area = c.findArea();//圆柱体表面积
		System.out.println(area);
		
		Circle cir = new Circle();
		cir.findArea();
		
	}

}
