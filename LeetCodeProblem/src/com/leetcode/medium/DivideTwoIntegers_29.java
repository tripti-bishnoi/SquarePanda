package com.leetcode.medium;

public class DivideTwoIntegers_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(5,2));
	}

	private static int divide(int dividend, int divisor) {
		// overflow conditions
		if ((dividend == Integer.MIN_VALUE && divisor == -1) || divisor == 0)
			return Integer.MAX_VALUE;
		int result = (int) divideHelper(Math.abs(Long.valueOf(dividend)), Math.abs(Long.valueOf(divisor)));
		int sign = (int) Math.signum(dividend ^ divisor);
		return sign >= 0 ? result : -result;
	}

	public static long divideHelper(long dividend, long divisor) {

		if (divisor == 0)
			return -1;
		if (dividend == 0)
			return 0;
		if (dividend == divisor)
			return 1;
		if (divisor == 1)
			return dividend;
		if(dividend < divisor)
			return 0;

		long quotient = 1;
		long temp = divisor;

		while (temp < dividend) {
			quotient <<= 1;
			temp <<= 1;
		}

		if (temp > dividend) {
			quotient >>= 1;
			temp >>= 1;
		}

		return quotient + divideHelper((int) Math.abs(dividend - temp), Math.abs(divisor));
	}

}
