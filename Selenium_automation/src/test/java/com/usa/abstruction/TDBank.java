package com.usa.abstruction;

public class TDBank implements USBANK{

	@Override
	public void getCheckingAC() {
		System.out.println("this is checking account");
		
	}

	@Override
	public void SavingAC() {
		System.out.println("this is saving account");
		
	}

	@Override
	public void StudentLone() {
		System.out.println("this is student loan account");
		
	}

	@Override
	public void CreditAC() {
		System.out.println("this is credit account");
		
	}
	public static void main(String[] args) {
		TDBank ac = new TDBank();
		ac.CreditAC();
		ac.getCheckingAC();
		ac.SavingAC();
		ac.StudentLone();
	}
	
	

}