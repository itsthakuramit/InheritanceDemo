package com.stackroute.mar12demos.newpkg2;


public class MainApp3 {
    
	public static void main(String[] args) {

//		final double pi = 3.14;
//		pi = 2.1;
		
		ChildSavingsAccount childsbAccount = new ChildSavingsAccount();
		
		childsbAccount.welcomemsg();
		int interest = childsbAccount.interestcalc(10000);
		System.out.println(interest);
		System.out.println(childsbAccount.accountopeningcredit);
	}
	
	
}
