package com.stackroute.mar12demos.newpkg2;


public class Account {
    
	final public int accountopeningcredit=1000;
	
	public Account() {
		System.out.println("Inside Parent class - Account - constructor");
	}
	
	//final - blocks overriding
	public void welcomemsg() {
		System.out.println("Inside - Account class - welcomemsg");
	}
	
}
