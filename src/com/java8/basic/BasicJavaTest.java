package com.java8.basic;

public class BasicJavaTest {
	public static void main(String[] arg){
		Integer i = 10;
		int j = 10;

		System.out.println("i==j : "+(i==j));

		System.out.println("i.equals(j) : "+i.equals(j));
		
		String s1 = "Hello World";
		String s2 = new String("Hello World");
		String s3 = "World";
		
		System.out.println("s1==s2 : "+ (s1==s2));
		System.out.println("s1.equals(s2) : "+ s1.equals(s2));
		System.out.println(s1.substring(6));
		System.out.println(""+ (s3.equals(s1.substring(6))));


	}
}
