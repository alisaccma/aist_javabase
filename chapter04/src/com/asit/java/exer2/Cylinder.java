package com.asit.java.exer2;

public class Cylinder extends Circle{
	private double length;//Բ���ĸ�
	public Cylinder(){
		length = 1;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	//Բ�������
	public double findVolume(){
		return findArea() * length;
	}
	//Բ���ı��������д����Circle�ķ���
	public double findArea(){
		//double area = Math.PI * this.getRadius() * this.getRadius() * 2
			//	+ Math.PI * this.getRadius() * 2 * this.length;
		double area = super.findArea() * 2 + Math.PI * this.getRadius() * 2 * this.length;
		return area;
	}
}
