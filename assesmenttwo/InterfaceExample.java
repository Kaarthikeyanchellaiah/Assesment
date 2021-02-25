package com.kctech.assesmenttwo;

public class InterfaceExample implements MyInterface {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		InterfaceExample obj= new InterfaceExample();
	    MyInterface.display();
		
	
	}

}
	

interface MyInterface
{
	static void display()
	{
		System.out.println("display method of MyInterface");
	}
}