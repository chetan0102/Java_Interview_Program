package com.extraprogram;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergetwounsortedarraysintosinglesortedarrayRemoveDuplicate {

	public static void main(String[] args) {
		
		int[] a = new int[] { 4, 2, 7, 1 };

		int[] b = new int[] { 8, 7, 9, 5 };
		
	int [] c	= IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
	System.out.println(Arrays.toString(c));

	}

}