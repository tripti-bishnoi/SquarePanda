package com.leetcode.medium;

import java.util.HashSet;

public class MinimumSwapsToMakeSequencesIncreasing_801 {

	public static void main(String[] args) {

		int[] A = { 1, 3, 5, 4 };
		int[] B = { 1, 2, 3, 7 };

		minSwap(A, B);
		
	
	}

	public static int minSwap(int[] A, int[] B) {

		if (A.length < 2)
			return 0;

		HashSet<Integer> set = new HashSet<>();

		for (int i = 1; i < A.length; i++) {
			if (A[i] < A[i - 1])
				set.add(i);
			else if (A[i] == A[i - 1])
				set.add(i + 1);
		}

		for (int i = 1; i < B.length; i++) {
			if (B[i] < B[i - 1])
				set.add(i);
			else if (B[i] == B[i - 1])
				set.add(i + 1);
		}

		return set.size();

	}

}
