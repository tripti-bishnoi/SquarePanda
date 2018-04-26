package com.leetcode.medium;

public class StringtoIntegeratoi_8 {

	public static void main(String[] args) {

		System.out.println(myAtoi("9223372036854775809"));

	}

	public static int myAtoi(String str) {

		String input = str.trim();

		if (input.length() < 1)
			return 0;

		Double num = (double) 0;
		Double multiplier = (double) 1;
		boolean flag = false;
		for (int i = input.length() - 1; i >= 0; i--) {
			if (flag)
				return 0;
			if (input.charAt(i) == '+') {
				flag = true;
				continue;
			} else if (input.charAt(i) == '-') {
				flag = true;
				num = 0 - num;
			} else {
				if (!Character.isDigit(input.charAt(i))) {
					num = (double) 0;
					multiplier = (double) 1;
					continue;
				} else {
					num += Character.getNumericValue(input.charAt(i)) * multiplier;
					multiplier *= 10;
				}
			}
		}
		if (num > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if (num < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		return num.intValue();
	}

}
