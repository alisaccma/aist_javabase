package com.asit.java.exer2;

public class TestCylinder {

	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		
		double volume = c.findVolume();
		System.out.println(volume);//Ĭ��ֵ
		
		c.setRadius(2.3);
		c.setLength(1.2);
		System.out.println(c.findVolume());
		
		double area = c.findArea();//Բ��������
		System.out.println(area);
		
		Circle cir = new Circle();
		cir.findArea();
		
	}

}
