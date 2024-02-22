package com.collectionprogramList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateElementsFromArrayList {

	public static void main(String[] args) {
		
		List<String> listWithDuplicateElements = new ArrayList<String>();
		 
        listWithDuplicateElements.add("JAVA");
 
        listWithDuplicateElements.add("J2EE");
 
        listWithDuplicateElements.add("JSP");
 
        listWithDuplicateElements.add("SERVLETS");
 
        listWithDuplicateElements.add("JAVA");
 
        listWithDuplicateElements.add("STRUTS");
 
        listWithDuplicateElements.add("JSP");
        
        System.out.println(listWithDuplicateElements);
      
        // 1 Constructing HashSet using listWithDuplicateElements
        Set<String> removeduplucate = new HashSet(listWithDuplicateElements);
        
        System.out.println(removeduplucate);
        
      // 2 Constructing LinkedHashSet using listWithoutDuplicateElements 
        
        Set<String> set = new LinkedHashSet<String>(listWithDuplicateElements);
        
        System.out.println(set);
        
        Set<String> Treeset = new TreeSet<String>(listWithDuplicateElements);
        System.out.println(Treeset);
	}

}
