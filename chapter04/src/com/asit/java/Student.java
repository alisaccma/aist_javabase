package com.asit.java;

public class Student extends Person{
	//private String name;
	//private int age;
	private String schoolName;
	public Student() {
		super.setAge(10);
	}
	//�Ը��������ķ�����д������
	public void eat(){
		System.out.println("ѧ���Է�");
	}
	//����
	public void eat(String str){
		System.out.println("ѧ���Է�");
	}
	//���ǶԸ���˽�е�walk(String str)��������д��
	void walk(String str){
		System.out.println("ѧ����·");
	}

	
}
