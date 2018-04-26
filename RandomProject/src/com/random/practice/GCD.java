package com.random.practice;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(gcd(0, 9));

		Stack<Integer> s = new Stack<>();
		
		Stack<Integer> temp = new Stack<>();
		
		while(!s.isEmpty()){
			
		}

	}

	static int gcd(int a, int b) {
		// Everything divides 0
		if (a == 0 || b == 0)
			return 0;

		// base case
		if (a == b)
			return a;

		// a is greater
		if (a > b)
			return gcd(a - b, b);
		return gcd(a, b - a);
	}

}
