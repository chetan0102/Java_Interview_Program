package com.extraprogram;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SeparateOddEvenNuInList {

	public static void main(String[] args) {
		List<Integer> lin = Arrays.asList(2, 3, 4, 5, 3, 5, 22, 45, 47, 11);

		Map<Boolean, List<Integer>> mapin = lin.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));

		System.out.println(mapin);

		Set<Entry<Boolean, List<Integer>>> setkey = mapin.entrySet();
		
		for (Entry<Boolean, List<Integer>> entry : setkey) {
			System.out.println("................");
			
			if (entry.getKey()) {
				
				System.out.println("EVEN no");
				
			}else {
				System.out.println("Odd no");
			}
			System.out.println("................");
				List<Integer>	lss =entry.getValue();
			for (int i: lss) {
				System.out.println(i);
			}
		}

	}

}
