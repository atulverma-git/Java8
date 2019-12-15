package com.dp.creational.builder;

public class User {
	private final String fName;
	private final String lName;
	private int age;
	private String address;
	
	public User(UserBuilder builder){
		fName = builder.fName;		// mandatory field
		lName = builder.lName;		// mandatory field
		age = builder.age;
		address = builder.address;
	}
	
	public static class UserBuilder{
		private final String fName;
		private final String lName;
		private int age;
		private String address;
		
		public UserBuilder(String fName, String lName){
			this.fName=fName;
			this.lName=lName;
		}
		
		public UserBuilder age(int age){
			this.age=age;
			return this;
		}
		
		public UserBuilder address(String address){
			this.address=address;
			return this;
		}
		
		public User buildUser(){
			return new User(this);
		}

	}
	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "User [fName=" + fName + ", lName=" + lName + ", age=" + age + ", address=" + address + "]";
	}
}
