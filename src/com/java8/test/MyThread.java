package com.java8.test;

public class MyThread {

	public static void main(String[] args) {
		Thread t1= new Thread(()->System.out.println("lambda run"));
		t1.start();
	}

}
