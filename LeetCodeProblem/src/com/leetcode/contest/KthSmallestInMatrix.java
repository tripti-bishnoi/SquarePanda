package com.leetcode.contest;

import java.util.Collections;
import java.util.HashMap;

public class KthSmallestInMatrix {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Tripti", 25);
		map.entrySet().stream().forEach(System.out::println);
		int[][] matrix = {
				{ 1,  5,  9},
				{10, 11, 13},
				{12, 13, 15}
		};
		int k = 8;
//		kthSmallest(matrix, k);
	}

	public static int kthSmallest(int[][] matrix, int k) {
		int rows = matrix.length;
		int cols = 1;
		if (rows > 0)
			cols = matrix[0].length;

		
		
		return 1;
	}

}
