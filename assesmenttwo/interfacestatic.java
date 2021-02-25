package com.kctech.assesmenttwo;

public class interfacestatic implements NewInterface { 

	public static void main(String[] args) 
	{ 

		NewInterface.hello(); 

	} 
	
} 

interface NewInterface {

	static void hello() 
	{ 
		System.out.println("Hello, New Static Method Here"); 
	} 

	
} 

