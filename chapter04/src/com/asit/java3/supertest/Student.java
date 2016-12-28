package com.asit.java3.supertest;

public class Student extends Person{
	private String schoolName;
	int id = 1002;//学生的学号
	public Student() {
		//super("jack");
		System.out.println("Student 空参构造器");
	}
	public Student(String schoolName){
		System.out.println("Student 带参构造器");
	}
	
	
	public void show(){
		System.out.println(this.id);
		System.out.println(super.name);
		System.out.println(super.id);
		super.show();
	}
	

}
