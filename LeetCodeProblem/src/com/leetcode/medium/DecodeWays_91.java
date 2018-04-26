package com.leetcode.medium;

public class DecodeWays_91 {

	public static void main(String[] args) {

		numDecodings("10");
	}

	public static int numDecodings(String s) {

		char[] digits = s.toCharArray();
		int len = digits.length;
		
		if(len < 1)
			return 0;
		

		int[] count = new int[len + 1];
		count[0] = 1;
		count[1] = (digits[0] == '0') ? 0 : 1;

		for (int i = 2; i <= len; i++) {
			char last = digits[i-1];
			char secondLast = digits[i-2];
			if(last > '0')
				count[i] = count[i-1];
			if(secondLast == '1' || (secondLast == '2' && last < '7'))
				count[i] += count[i-2];
 		}
		
		return count[len];
	}

}
