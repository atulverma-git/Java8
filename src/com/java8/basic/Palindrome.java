package com.java8.basic;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("malayalam is palindrome:"+isPalindrom("malayalam"));
		System.out.println("hollohw is palindrome:"+isPalindrom("hollohw"));

	}
	
	public static boolean isPalindrom(String str){
		//boolean isPalindrom = false;
		String palindrom ="";
		int len = str.length();
		for(int i=str.length()-1;i>=0;i--){
			palindrom = palindrom+str.charAt(i);
		}
		
		return palindrom.equalsIgnoreCase(str);
	}

}
