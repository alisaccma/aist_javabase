package com.asit.java2.ordertest;

import com.asit.java2.Order;

//不同包中可以访问的修饰符修饰的变量、方法
public class OrderTest{
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
