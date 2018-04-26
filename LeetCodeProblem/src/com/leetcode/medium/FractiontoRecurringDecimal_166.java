package com.leetcode.medium;

import java.util.HashMap;

public class FractiontoRecurringDecimal_166 {

	public static void main(String[] args) {

		fractionToDecimal(3227, 555);
	}

	public static String fractionToDecimal(int numerator, int denominator) {

		if (denominator == 0)
			return "";
		
		if(numerator == 0)
			return "0";

		StringBuilder str = new StringBuilder();

		if (Integer.signum(numerator ^ denominator) < 0)
			str.append("-");

		long num = Math.abs(Long.valueOf(numerator));

		long den = Math.abs(Long.valueOf(denominator));

		long quotient = num / den;
		long remainder = num % den;

		str.append(quotient);

		if (remainder == 0)
			return str.toString();

		str.append(".");

		HashMap<Long, Integer> map = new HashMap<>();

		while (!map.containsKey(remainder)) {
			map.put(remainder, str.length());
			quotient = remainder * 10 / den;
			remainder = remainder * 10 % den;
			if (remainder != 0 || remainder == 0 && !map.containsKey(remainder)) {
				str.append(quotient);
			}
		}
		
		if (remainder != 0) {
			str.insert(map.get(remainder), "(");
			str.append(')');
		}

		return str.toString();
	}

}
