package com.kctech.assesmenttwo;

import java.util.ArrayList;
import java.util.List;

public class Sumlamda {
	

	public static int sum(List<Integer> list) 
	{ 
		return list.stream().filter(i -> i > 5).mapToInt(i -> i).sum(); 
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			List<Integer> list = new ArrayList<Integer>(); 
			

			list.add(5); 
			list.add(3); 
			list.add(4); 
			list.add(55); 
			list.add(2);  
			System.out.println(sum(list)); 
		

		
   
	}

}
