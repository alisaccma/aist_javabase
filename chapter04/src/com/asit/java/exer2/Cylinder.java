package com.asit.java.exer2;

public class Cylinder extends Circle{
	private double length;//圆柱的高
	public Cylinder(){
		length = 1;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	//圆柱的体积
	public double findVolume(){
		return findArea() * length;
	}
	//圆柱的表面积，重写父类Circle的方法
	public double findArea(){
		//double area = Math.PI * this.getRadius() * this.getRadius() * 2
			//	+ Math.PI * this.getRadius() * 2 * this.length;
		double area = super.findArea() * 2 + Math.PI * this.getRadius() * 2 * this.length;
		return area;
	}
}
