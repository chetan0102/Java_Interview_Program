package com.collectionprogram.List;

import java.util.ArrayList;

public class DecreaseCurrentCapacityofArrayList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		 
        //Now 'list' can hold 10 elements (Default Initial Capacity)
		System.out.println(list.size());
 
        list.ensureCapacity(10);
        
        System.out.println(list.size());
        
        //Now 'list' can hold 20 elements.
 
        list.add("ONE");
 
        list.add("TWO");
 
        list.add("THREE");
 
        list.add("FOUR");
        System.out.println(list.size());
 
        //reducing the current capacity to current size of an ArrayList.
 
        list.trimToSize();
        System.out.println(list.size());
    
	}

}
