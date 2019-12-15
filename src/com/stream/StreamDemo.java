package com.stream;

import java.util.stream.IntStream;

public class StreamDemo {

	public static void main(String[] args) {
		/*
		 * ******************* Array in stream **************************
		 */
		int[] numbers = {1,5,8,4,10,3,7,2,5};
		
		/* 
		 * IntStream stream interface for Integer type stream. 
		 * to perform min/max/avg function use this stream
		 */
		int min =IntStream.of(numbers).min().getAsInt();
		System.out.println(min);
		
		// or perform min operation if array is not empty
		//IntStream.of(numbers).min().ifPresent(m->System.out.println(m));
		
		//******************** Finding 3 Distinct smallest No in Array *************
		System.out.println("3 Distinct Smalles No:");
		IntStream.of(numbers)
		.distinct()
		.sorted()
		.limit(3)
		.forEach(System.out::println);
	}

}
