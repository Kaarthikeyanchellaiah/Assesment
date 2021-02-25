package com.kctech.assesmenttwo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stringempty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        List<String> names = Arrays.asList("Core", "","","", "Java","!","Test");

		        Stream<String> s = names.stream();


		        Predicate<String> isEmpty = String::isEmpty;
		        Predicate<String> notEmpty = isEmpty.negate();
		        
		        System.out.println(s.filter(notEmpty).collect(Collectors.toList()));
		    

	}

}
