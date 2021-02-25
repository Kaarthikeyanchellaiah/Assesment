package com.kctech.Assesmentone;

public class Foo {
	
	public Foo()
	{
		doSomething();
	}

	public void doSomething()
	{
		System.out.println("do something acceptab;e");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
	}

}

class bar extends Foo
{
	public void doSomething()
	{
		System.out.println("yolo");
	}
	
	public static void main(String[] args) {
		
		// Zoom zoom = new Zoom(this);
		//Creating an object for class ZOOM is not needed
	}
}
