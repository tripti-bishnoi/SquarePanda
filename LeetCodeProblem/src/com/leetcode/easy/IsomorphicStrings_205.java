package com.leetcode.easy;

import java.util.HashMap;

public class IsomorphicStrings_205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isIsomorphic(String a, String b) {
        return areCryptoequivalentHelper(a, b) && areCryptoequivalentHelper(b, a);
	}

	public static boolean areCryptoequivalentHelper(String a, String b) {

		HashMap<Character, Character> map = new HashMap<>();

		for (int i = 0; i < a.length(); i++) {
			char aCh = a.charAt(i);
			char bCh = b.charAt(i);
			if (map.containsKey(aCh)) {
				if (map.get(aCh) != bCh)
					return false;
			} else {
				map.put(aCh, bCh);
			}
		}

		return true;
	}

}
