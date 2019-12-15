package com.java8.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PersonImpl {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Atul", "Verma", 35),
				new Person("Aarti", "Singh", 32),
				new Person("Kundan", "Singh", 34),
				new Person("Amit", "Verma", 35),
				new Person("Chandan", "Singh", 32),
				new Person("Preeti", "Verma", 32)
				);
		
		System.out.println("Sort with first name");
		Collections.sort(persons, (p1,p2)->p1.getfName().compareTo(p2.getfName()));
		performConditionally(persons, p->true, p-> System.out.println(p));
		
		System.out.println("\nPrint person first name starts with A");
		performConditionally(persons, p->p.getfName().startsWith("A"), p-> System.out.println(p.getfName()));
		
		System.out.println("\nPrint person last name start with S");
		performConditionally(persons, p->p.getlName().startsWith("S"), p-> System.out.println(p.getlName()+" "+p.getfName()));
	}
	
	public static void printAll(List<Person> persons){
		for(Person p: persons){
			System.out.println(p);
		}
	}
	
	public static void performConditionally(List<Person> persons ,Predicate<Person> predicate, Consumer<Person> consumer){
		for(Person p: persons){
			if(predicate.test(p)){
				consumer.accept(p);
			}
		}
	}

}

interface Condition{
	public boolean filter(Person person);
}
