package com.extraprogram;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EachElementCountList {

	public static void main(String[] args) {
		
		String s = "Darshana will be going to londan";
		
		Map<Character, Long>  mm=	
				s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(mm);
	}

}
