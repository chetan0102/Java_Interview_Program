package com.extraprogram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateInList {
	
	public static void main(String[] args) {
		
	List ls =	Arrays.asList("Java","Ketan","Tarun","Ketan","C#");
	System.out.println(ls.stream().distinct().collect(Collectors.toList()));
	}

}
