package com.asit.java;

public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	void eat(){
		System.out.println("�˳Է�");
	}
	private void walk(){
		System.out.println("����·");
	}
	public void show(){
		walk();
	}
}
