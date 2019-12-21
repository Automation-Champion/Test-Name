package com.usa.polymorepysum;

/**Polymorphism in Java
The word polymorphism means having many forms. In simple words, 
we can define polymorphism as the ability of a message to be displayed 
in more than one form.

Real life example of polymorphism: A person at the same time can have 
different characteristic. Like a man at the same time is a father, 
a husband, an employee. So the same person posses different behaviour 
in different situations. This is called polymorphism.

Polymorphism is considered as one of the important features of 
Object Oriented Programming. Polymorphism allows us to perform 
a single action in different ways. In other words, polymorphism allows you 
to define one interface and have multiple implementations. 
The word “poly” means many and “morphs” means forms, So it means many forms.
*/

//Java program for Method overloading 

/**Method Overloading: When there are multiple functions with same name but 
different parameters then these functions are said to be overloaded. 
Functions can be overloaded by change in number of arguments or/and change 
in type of arguments.*/

class MultiplyFun {

	// Method with 2 parameter
	static int Multiply(int a, int b) {
		return a * b;
	}

	// Method with the same name but 2 double parameter
	static double Multiply(double a, double b) {
		return a * b;
	}
}

class Main {
	public static void main(String[] args) {

		System.out.println(MultiplyFun.Multiply(2, 4));

		System.out.println(MultiplyFun.Multiply(5.5, 6.3));
	}
}
