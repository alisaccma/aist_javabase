package com.asit.java3.supertest;

public class Student extends Person{
	private String schoolName;
	int id = 1002;//ѧ����ѧ��
	public Student() {
		//super("jack");
		System.out.println("Student �ղι�����");
	}
	public Student(String schoolName){
		System.out.println("Student ���ι�����");
	}
	
	
	public void show(){
		System.out.println(this.id);
		System.out.println(super.name);
		System.out.println(super.id);
		super.show();
	}
	

}
