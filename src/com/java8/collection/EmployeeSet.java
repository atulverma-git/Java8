package com.java8.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.java8.basic.Employee;

public class EmployeeSet {
	public static void main(String arg[]){
		Employee emp1 = new Employee(1, "Atul", 50000);
		Employee emp2 = emp1; // this will not be added in set as set is using default equals method while inserting elements
		//Employee emp2 = new Employee(1, "Atul", 50000);
		Employee emp3 = new Employee(1, "Atul", 50000);
		Employee emp4 = new Employee(1, "Atul", 50000);
		
		System.out.println("hashcode of emp1: "+emp1.hashCode());
		System.out.println("hashcode of emp2: "+emp2.hashCode());
		System.out.println("hashcode of emp3: "+emp3.hashCode());
		System.out.println("hashcode of emp4: "+emp4.hashCode());
		
		Set<Employee> empSet = new HashSet<>();
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		
		System.out.println("Size of the Set"+empSet.size());
		
		empSet.forEach(emp->System.out.println(emp));
		
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		System.out.println("Size of List:"+empList.size());
		
		empList.forEach(emp->System.out.println(emp));
		
		
		
	}
}
