package com.stackroute.mar12demos;


public class BasicsApp {
    
	public BasicsApp() {
		System.out.println("Inside No Arg constructors");
	}
	
	public BasicsApp(String username) {
		System.out.println("User : "+username);
	}
	
	public BasicsApp(String username, int age) {
		System.out.println("User : "+username+" and  age :"+age);
	}
	
	
}
