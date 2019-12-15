package com.java8.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RepeatedWordInFile {

	public static void main(String[] args) {
		Map<String, Integer> wordCount = new HashMap<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Aarti\\Documents\\sample.txt"));) {
			String readLine = br.readLine();
			String[] wordArray = readLine.toLowerCase().split("\\s");
			
			while(readLine!=null){
				for(String word:wordArray){
					if(wordCount.containsKey(word)){
						wordCount.put(word, wordCount.get(word)+1);
					}else{
						wordCount.put(word, 1);
					}
				}
				readLine = br.readLine();
			}
			
			String mostRepeatedWord=null;
			int count=0;
			for(Entry<String, Integer> entry:wordCount.entrySet()){
				if(entry.getValue()>count){
					mostRepeatedWord = entry.getKey();
					count = entry.getValue();
				}
			}
			
			System.out.println("Most repeated word is "+mostRepeatedWord+" repeated at "+count+" times");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
