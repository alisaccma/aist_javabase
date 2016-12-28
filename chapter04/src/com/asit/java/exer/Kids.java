package com.asit.java.exer;

public class Kids extends ManKind {
	private int yearsOld;
	
	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	void printAge(){
		System.out.println(this.yearsOld + " years old");
	}
	void employeed(){
		super.employeed();
		System.out.println("Kids should study and no job.");
	}
	
	
	public static void main(String[] args) {
		Kids someKid = new Kids();
		
		someKid.setSalary(0);
		someKid.setSex(0);
		someKid.setYearsOld(13);
		
		someKid.employeed();
		someKid.manOrWorman();
		someKid.printAge();
	}
}
