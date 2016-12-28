package com.asit.java.exer;

public class ManKind {
	private int sex;
	private int salary;
	
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	void manOrWorman(){
		if(sex == 1){
			System.out.println("man");
		}else if(sex == 0){
			System.out.println("women");
		}else{
			System.out.println("性别有误");
		}
	}
	void employeed(){
		if(salary == 0){
			System.out.println("no job");
		}else if(salary > 0){
			System.out.println("job");
		}else{
			System.out.println("salary有误");
		}
	}
}
