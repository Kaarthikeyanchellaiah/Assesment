package com.kctech.assesmenttwo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Testone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("D");        
        myList.add("C");
        myList.add("B");
        myList.sort(Comparator.comparing(s -> s));
        myList.forEach(System.out::println);

	}

}
