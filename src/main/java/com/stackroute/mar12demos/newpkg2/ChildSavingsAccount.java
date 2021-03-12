package com.stackroute.mar12demos.newpkg2;

// final - blocks further inheritance
public class ChildSavingsAccount extends SavingsAccount {

	public ChildSavingsAccount() {
		super();
		System.out.println("Inside Child savings account constructor");
	}
	public int accountopeningcredit=2000;

	public int interestcalc(int amount) {
		return amount*5/100;
	}
	
	public void welcomemsg() {
		super.welcomemsg();
		System.out.println("Inside - Child Savings Account Class - welcomemsg");
	}
	
}
