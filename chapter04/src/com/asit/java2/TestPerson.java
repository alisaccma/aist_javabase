package com.asit.java2;
//compare方法
public class TestPerson {

	public static void main(String[] args) {
		Person zJ = new Person("zhangjun", 23);
		Person lKH = new Person("liukaihao", 20);
		
		int com = zJ.compare(lKH);
		System.out.println(com);//1
	}

}
class Person{
	private String name;
	private int age;
	
	public Person(){
		this.name = "jack";
		this.age = 18;
	}
	
	public Person(String name){
		this();
		this.name = name;
	}
	public Person(String name, int age){
		this(name);
		this.age = age;
	}

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
	//比较当前对象与形参的对象的age谁大
	public int compare(Person p){
		if(this.age > p.age){
			return 1;
		}else if(this.age < p.age){
			return -1;
		}else{
			return 0;
		}
		
	}
	
}






