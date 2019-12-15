package com.dp.creational.builder;

public class UserBuilderTest {
	public static void main(String arg[]){

		// create user using user builder with all parameter
		User user = new User.UserBuilder("Atul", "Verma").age(35).address("Delhi").buildUser();
		System.out.println(user);
		
		// create user using user builder with mandatory parameter
		User user2 = new User.UserBuilder("Bom", "Marley").buildUser();
		System.out.println(user2);
	}
}
