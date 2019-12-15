package com.java8.collection;

import java.util.HashMap;
import java.util.Map;

import com.java8.basic.Employee;

public class MapTestForEqualandHash {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Atul", 50000);
		Employee emp2 = new Employee(1, "Atul", 50000);
		Employee emp3 = new Employee(2, "Aarti", 50000);
		Employee emp4 = new Employee(3, "Kundan", 500000);
		
		Map<Employee, String> empMap = new HashMap<>();
		
		empMap.put(emp1, emp1.getName());
		empMap.put(emp2, emp2.getName()); // If equal method is not override, map will put duplicate item
		empMap.put(emp3, emp3.getName());
		empMap.put(emp4, emp4.getName());
		
		System.out.println("Hashcode..............");
		System.out.println("emp1:"+emp1.hashCode());
		System.out.println("emp2:"+emp2.hashCode()); // If hashCode() method is not override, it will return diff hashCode
		System.out.println("emp3:"+emp3.hashCode());
		System.out.println("emp4:"+emp4.hashCode());
		
		empMap.forEach((emp,name)->System.out.println(emp));
		
		Employee emp5 = new Employee(1, "Atul", 50000);
		
		System.out.println(empMap.get(emp5)); // it will return null if hasCode() is not overridden. 
		
		
	}

}
