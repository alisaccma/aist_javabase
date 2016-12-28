package com.asit.java3.supertest;

public class Person {
	String name;
	private int age;
	int id = 1001;//人的身份证号
	
	public Person(){
		System.out.println("Person 空参构造器");
		this.name = "AA";
		this.age = 1;
	}
	public Person(String name){
		//this();
		System.out.println("Person 带参构造器");
		this.name = name;
	}
	
	public void show(){
		System.out.println("Person show");
	}
}
