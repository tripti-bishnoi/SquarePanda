package com.leetcode.easy;

public class ConstructStringfromBinaryTree_606 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String tree2str(TreeNode root) {
		if (root == null)
			return "";
		String output = "" + root.val;
		if (root.left != null)
			output += "(" + tree2str(root.left) + ")";
		if (root.right != null) {
			if (root.left == null) {
				output += "()";
			}
			output += "(" + tree2str(root.right) + ")";
		}
		return output;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
