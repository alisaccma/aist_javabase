package com.asit.java;

public class Student extends Person{
	//private String name;
	//private int age;
	private String schoolName;
	public Student() {
		super.setAge(10);
	}
	//对父类重名的方法重写、覆盖
	public void eat(){
		System.out.println("学生吃放");
	}
	//重载
	public void eat(String str){
		System.out.println("学生吃放");
	}
	//不是对父类私有的walk(String str)方法的重写。
	void walk(String str){
		System.out.println("学生走路");
	}

	
}
