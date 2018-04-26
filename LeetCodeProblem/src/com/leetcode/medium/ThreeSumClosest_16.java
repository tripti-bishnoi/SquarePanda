package com.leetcode.medium;

import java.util.Arrays;
import java.util.TreeSet;

public class ThreeSumClosest_16 {

	public static void main(String[] args) {

		int[] nums = { -1, 2, 1, -4 };
		System.out.println(threeSumClosest(nums, 1));
	}

	public static int threeSumClosest(int[] nums, int target) {

		Arrays.sort(nums);

		TreeSet<Integer> set = new TreeSet<>();
		for (int i : nums)
			set.add(i);

		for (int i = 1; i < nums.length; i++) {
			int a = nums[i];
			int j = nums.length-1;
			while(j>i){
				
			}

		}

		return -1;
	}

}
