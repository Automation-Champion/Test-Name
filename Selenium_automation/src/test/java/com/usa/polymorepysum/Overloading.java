package com.usa.polymorepysum;

public class Overloading {

	
	public void Alam (int a){
		System.out.println(a);	
	}
	public void Alam (String a, int b){
		String result = a + b;
		System.out.println(result);
	}
	public void Alam (String a, String b){
		
	}
	public static void main(String[] args) {
		Overloading obj = new Overloading();
       obj.Alam(100);
       
      obj.Alam("alam", 40);
		
	}

}