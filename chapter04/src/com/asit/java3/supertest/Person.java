package com.asit.java3.supertest;

public class Person {
	String name;
	private int age;
	int id = 1001;//�˵����֤��
	
	public Person(){
		System.out.println("Person �ղι�����");
		this.name = "AA";
		this.age = 1;
	}
	public Person(String name){
		//this();
		System.out.println("Person ���ι�����");
		this.name = name;
	}
	
	public void show(){
		System.out.println("Person show");
	}
}
