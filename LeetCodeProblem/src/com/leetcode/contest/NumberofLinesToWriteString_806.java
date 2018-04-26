package com.leetcode.contest;
/*
 * We are to write the letters of a given string S, from left to right into lines. Each line has maximum width 100 units, and if writing a letter would cause the width of the line to exceed 100 units, it is written on the next line. We are given an array widths, an array where widths[0] is the width of 'a', widths[1] is the width of 'b', ..., and widths[25] is the width of 'z'.

Now answer two questions: how many lines have at least one character from S, and what is the width used by the last such line? Return your answer as an integer list of length 2.
 */

public class NumberofLinesToWriteString_806 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] widths1 = { 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
				10, 10 };
		numberOfLines(widths1, "bbbcccdddaaa");
		int[] widths2 = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
				10, 10, 10 };
		numberOfLines(widths2, "abcdefghijklmnopqrstuvwxyz");

	}

	public static int[] numberOfLines(int[] widths, String S) {
		char[] c = S.toCharArray();
		int line = 0;
		int width = 0;
		for (char ch : c) {
			width += widths[ch - 'a'];
			if (width > 100) {
				width = widths[ch - 'a'];
				++line;
			}
		}
		++line;
		int[] output = { line, width };
		return output;
	}

}
