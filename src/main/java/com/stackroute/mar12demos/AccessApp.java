package com.stackroute.mar12demos;


public class AccessApp {
    
	private void displayPrivateMethod() {
		System.out.println("Inside private method");
	}
	
	public void displayPublicMethod() {
		System.out.println("Inside public method");
	}
	
	protected void displayProtectedMethod() {
		System.out.println("Inside protected method");
	}
	
	void displayDefaultMethod() {
		System.out.println("Inside default method");
	}
	
	
}
