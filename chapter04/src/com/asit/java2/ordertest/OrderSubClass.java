package com.asit.java2.ordertest;

import com.asit.java2.Order;

//ͬһ�����п��Է��ʵ����η����εı���������
public class OrderSubClass extends Order{
	public void show(){
		super.myIntPublic = 1;
		super.myIntProteced = 1;
		//super.myIntDefault = 1;
		//super.myIntPrivate = 1;
		
		super.myMethodPublic();
		super.myMethodProteced();
		//super.myMethodDefault();
		//super.myMethodPrivate();
	}
	public static void main(String[] args) {
		Order o = new Order();
		o.myIntPublic = 1;
		//o.myIntProteced = 1;
		//o.myIntDefault = 1;
		//o.myIntPrivate = 1;
		
		o.myMethodPublic();
		//o.myMethodProteced();
		//o.myMethodDefault();
		//o.myMethodPrivate();
	}
}
