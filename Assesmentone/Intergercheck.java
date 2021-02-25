package com.kctech.Assesmentone;

public class Intergercheck {

	public static void main(String[] args) 
	{ 
		Integer a = 1000, b = 1000; 
		System.out.println(a == b); 
		Integer c = 100, d = 100; 
		System.out.println(c == d); 
		
	}

}
//This is actually where it gets interesting. If you look into the Integer.java class ,
//you will find that there is an inner private class, IntegerCache.java that caches all Integer objects between -128 and 127.