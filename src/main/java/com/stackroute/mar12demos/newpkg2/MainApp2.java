package com.stackroute.mar12demos.newpkg2;


public class MainApp2 {
    
	public static void main(String[] args) {

		SavingsAccount sbAccount = new SavingsAccount();
		
		sbAccount.welcomemsg();
		int interest = sbAccount.interestcalc(10000);
		System.out.println(interest);
		
	}
	
	
}
