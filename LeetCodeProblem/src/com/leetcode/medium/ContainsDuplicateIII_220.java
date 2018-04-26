package com.leetcode.medium;

import java.util.TreeSet;

public class ContainsDuplicateIII_220 {

	public static void main(String[] args) {

		int[] input = { -1, 2147483647 };

		System.out.println(containsNearbyAlmostDuplicate(input, 1, 2147483647)); // should
		// return
		// true
	}

	public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

		/*
		 * BST + Slide Window: Time ~ O(NlogK), Space ~ O(K)
Maintain a TreeSet (red-black tree implementation) with size K.
For each num[i], check if there is a element in the TreeSet that is within [ num[i] - t, num[i] + t ] (using TreeSet.floor() and TreeSet.ceiling()).
If yes, return true, since the difference between index i and all the indices within the TreeSet will not exceed t;
If not, add num[i] to the TreeSet, and once the TreeSet exceeds its size K, we remove num[i - k], which is the furthest element to num[i] (keep a sliding window containing K elements of nums).
Note: The condition of TreeSet size exceeding K is i >= K instead of i > K.
		 */
		TreeSet<Integer> treeSet = new TreeSet<>();

		for (int i = 0; i < nums.length; i++) {
			int item = nums[i];
			if (treeSet.floor(item) != null && treeSet.floor(item) >= item - t
					|| treeSet.ceiling(item) != null && treeSet.ceiling(item) <= item + t) {
				return true;
			} else {
				treeSet.add(item);
				if (i >= k)
					treeSet.remove(nums[i - k]);
			}
		}

		return false;

	}

}
