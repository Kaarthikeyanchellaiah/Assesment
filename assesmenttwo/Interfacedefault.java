package com.kctech.assesmenttwo;

public class Interfacedefault implements TestInterface {



		public static void main(String args[]) 
		{ 
			Interfacedefault d= new Interfacedefault();
			 
			d.runit(); 
		} 
	} 

interface TestInterface 
{ 
	
	default void runit() 
	{ 
	System.out.println("Default Method Executed"); 
	} 
} 
