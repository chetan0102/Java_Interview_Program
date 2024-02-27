package com.extraprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMaximumAndMinimumList {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = Arrays.asList(45, 91, 55, 11, 432, 12, 56, 15, 24, 75, 31, 89);

		int max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
		
		Optional.empty().stream();

		System.out.println(max);

		int min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();

		System.out.println(min);
	}

}
