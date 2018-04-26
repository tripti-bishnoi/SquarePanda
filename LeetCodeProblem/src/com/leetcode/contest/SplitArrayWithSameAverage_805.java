package com.leetcode.contest;

/*
 * In a given integer array A, we must move every element of A to either list B or list C. (B and C initially start empty.)

Return true if and only if after such a move, it is possible that the average value of B is equal to the average value of C, and B and C are both non-empty.

Example :
Input: 
[1,2,3,4,5,6,7,8]
Output: true
Explanation: We can split the array into [1,4,5,8] and [2,3,6,7], and both of them have the average of 4.5.
 */
public class SplitArrayWithSameAverage_805 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(splitArraySameAverage(a));
	}

	public static boolean splitArraySameAverage(int[] a) {
		int sum = 0;
		for(int i: a)
			sum += i;
		
		int leftsum = 0;
		int rightsum = 0;
		for(int i=0; i<a.length; i++){
			leftsum += a[i];
			rightsum = sum - leftsum;
			if(leftsum*(a.length-i-1) == rightsum*(i+1)){
				return true;
			}
		}
		return false;
	}

}
