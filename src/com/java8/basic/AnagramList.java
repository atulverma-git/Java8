package com.java8.basic;

public class AnagramList {

	public static void main(String[] args) {
		
	}
	
	public static boolean isAnagram(String input, String anagram){
		char[] inputArr = input.toCharArray();
		for(char ch:inputArr){
			int index = anagram.indexOf(ch);
			if(index!=-1){
				anagram=anagram.substring(0, index)+anagram.substring(index+1, anagram.length());
			}else{
				return false;
			}
		}
		
		return anagram.isEmpty();
	}

}
