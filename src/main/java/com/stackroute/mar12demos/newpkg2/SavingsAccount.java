package com.stackroute.mar12demos.newpkg2;


public class SavingsAccount extends Account {
    
	public SavingsAccount() {
		super();
		System.out.println("Insude SavingsAccount constructor");
	}
	public int interestcalc(int amount) {
		return amount*3/100;
	}
	
	public void welcomemsg() {
		super.welcomemsg();
		System.out.println("Inside - Savings Account Class - welcomemsg");
	}

	
}
