package com.leetcode.medium;

public class ReverseWordsinaString_151 {

	public static void main(String[] args) {
		System.out.println(reverseWords("   a   b "));
	}

	public static String reverseWords(String s) {
		s = s.trim().replaceAll(" +", " ");
		char[] chars = s.toCharArray();
		int start = 0;
		int end = chars.length - 1;
		helper(chars, start, end);
		
		for(int i = start; i <= end+1; i++) {
			if(i==end+1 || chars[i] == ' '){
				helper(chars, start, i-1);
				start = i+1;
			}
		}
		return String.valueOf(chars);
	}

	public static void helper(char[] s, int start, int end) {
		while (end > start) {
			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			end--;
			start++;
		}
	}

}
