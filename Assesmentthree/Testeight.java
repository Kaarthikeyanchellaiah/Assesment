package com.kctech.assesmentthre;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Testeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 HashMap<String, Integer> mapsample 
         = new HashMap<>(); 

    
     mapsample.put("karthik", 25); 
     mapsample.put("saru", 23); 
     mapsample.put("arbaz", 25); 


     Set<String> keySet = mapsample.keySet(); 

      
     ArrayList<String> listKeys 
         = new ArrayList<String>(keySet); 

     Collection<Integer> values = mapsample.values(); 

     ArrayList<Integer> listValues 
         = new ArrayList<>(values); 

     System.out.println("The Keys of the Map are "
                        + listKeys); 

     System.out.println("The Values of the Map are "
                        + listValues); 		

	}

}
