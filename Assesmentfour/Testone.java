package com.kctech.five;

import java.util.Arrays;

public class Testone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String ar1[]= {"cinema","host","aba","train","java"};
		  String ar2[]= {"iceman","shot","bab","rain","avja"};
		  
		  for (int i = 0; i < ar1.length; i++)
		  {
	            char[] ch1 = ar1[i].toCharArray();
	            char[] ch2 = ar2[i].toCharArray();
	            Arrays.sort(ch1);
	            Arrays.sort(ch2);
	            if (Arrays.equals(ch1, ch2))
	            {
	                System.out.println("This is an Anagram "+"1");
	            }
	            else
	            {	
	                System.out.println("This is not an Anagram "+"0");
	            }
	}

}}
