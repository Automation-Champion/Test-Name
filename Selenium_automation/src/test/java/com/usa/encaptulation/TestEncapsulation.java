package com.usa.encaptulation;

public class TestEncapsulation 
{     
    public static void main (String[] args)  
    { 
        Encapsulate obj = new Encapsulate(); 
          
        // setting values of the variables  
        obj.setName("Smarttech"); 
        obj.setAge(1); 
        obj.setRoll(51); 
          
        // Displaying values of the variables 
        System.out.println("School's name: " + obj.getName()); 
        System.out.println("School's age: " + obj.getAge()); 
        System.out.println("roll: " + obj.getRoll()); 
          
        // Direct access of geekRoll is not possible 
        // due to encapsulation 
        // System.out.println("Geek's roll: " + obj.geekName);         
    } 
} 
