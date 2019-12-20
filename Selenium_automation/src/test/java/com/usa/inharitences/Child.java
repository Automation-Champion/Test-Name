package com.usa.inharitences;

public class Child extends Parants{
	
	void childProperty() {
		System.out.println("I am a King");
		
	}
	
	public static void main(String[] args) {
		Child obj = new Child();
		
		obj.childProperty(); // I am from child property
		
		System.out.println(obj.paremetarised("Alam ", 40)); // i am from parents
		
		System.out.println(obj.getSalary());   // i am from grand parents
		
		
	}

}
