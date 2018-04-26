package com.random.practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(classicFib(10));
		dynamicFib(10);
	}

	/*
	 * classic recursive fib, nth fib number Runtime Complexity: Exponential,
	 * O(2n) Memory Complexity: Linear, O(n)
	 */
	public static int classicFib(int n) {
		// base case
		if (n <= 0)
			return 0;
		else if (n == 1)
			return 1;
		
		// recursive call
		return classicFib(n - 1) + classicFib(n - 2);
	}

	/*
	 * Dynamic programming, nth fib number Runtime Complexity: Linear, O(n)
	 * Memory Complexity: Constant, O(1)
	 */
	public static void dynamicFib(int n) {
		// base case
		if (n <= 0)
			System.out.println(0);//return 0;
		else if (n == 1)
			System.out.println(1);//return 1;
		
		// fib(n) = fib(n-1) + fib(n-2)
		int n1 = 1;
		int n2 = 0;
		int result = 0;
		
		// iterative solution
		for (int i = 2; i <= n; i++) {
			result = n1 + n2;
			System.out.println(result);
			n2 = n1;
			n1 = result;
		}

		//return result;
	}

}
