package com.java8.test;

public class Greeter {
	
	public void greet(Greeting greeting){
		greeting.perform();
	}
	
	public void add(MyAdd myAdd){
		System.out.println("addition of two no:"+ myAdd.add(10, 20));
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		Greeting greetLambd = ()-> System.out.println("Hello");
		greeter.add((i,j)-> i+j);
		greeter.greet(greetLambd);
	}

}

@FunctionalInterface
interface MyAdd{
	public int add(int i, int j);
}