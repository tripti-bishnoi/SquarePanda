package com.leetcode.medium;

public class SurroundedRegions_130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = { { 'X', 'X', 'X', 'X' }, { 'X', 'X', 'O', 'X' }, { 'X', 'X', 'X', 'X' },
				{ 'X', 'O', 'X', 'X' } };

		solve(board);
	}

	public static void solve(char[][] board) {

		int rows = board.length;
		if (rows < 1)
			return;
		int cols = board[0].length;
		if (rows <= 2 || cols <= 2)
			return;

		// Step 1: Replace all 'O' with '#'
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				if (board[r][c] == 'O')
					board[r][c] = '#';
			}
		}

		// Step 2: Call FLOOD FILL ALGORITHM for all '#' lying on edges
		for (int r = 0; r < rows; r++) {
			if (board[r][0] == '#') // first column
				floodfill(board, r, 0, '#', 'O');
			if (board[r][cols - 1] == '#') // last column
				floodfill(board, r, cols - 1, '#', 'O');
		}

		for (int c = 0; c < cols; c++) {
			if (board[0][c] == '#') // first row
				floodfill(board, 0, c, '#', 'O');
			if (board[rows - 1][c] == '#') // last row
				floodfill(board, rows - 1, c, '#', 'O');
		}

		// Step 3: Replace all '#' with 'X'
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				if (board[r][c] == '#')
					board[r][c] = 'X';
			}
		}
		System.out.println("done");
	}

	private static void floodfill(char[][] board, int row, int col, char prevChar, char newChar) {

		int rows = board.length;
		int cols = 0;
		if (rows > 0)
			cols = board[0].length;

		if (board[row][col] != prevChar)
			return;

		// Replace prevChar with newChar
		board[row][col] = newChar;

		// Recur for left, right, top, bottom
		if (col + 1 < cols)
			floodfill(board, row, col + 1, prevChar, newChar);
		if (col - 1 >= 0)
			floodfill(board, row, col - 1, prevChar, newChar);
		if (row + 1 < rows)
			floodfill(board, row + 1, col, prevChar, newChar);
		if (row - 1 >= 0)
			floodfill(board, row - 1, col, prevChar, newChar);

	}

}
