package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WordLadder_127 {

	public static void main(String[] args) {
		List<String> wordList = new ArrayList<>();
		wordList.add("hot");
		wordList.add("dot");
		wordList.add("dog");
		wordList.add("lot");
		wordList.add("log");
		wordList.add("cog");
		ladderLength("hit", "cog", wordList);

	}

	// two END BFS solution
	public static int ladderLength(String beginWord, String endWord, List<String> wordList) {

		if (wordList == null || wordList.size() == 0)
			return 0;

		HashSet<String> hash = new HashSet<>(wordList);

		if (!hash.contains(endWord))
			return 0;

		if (beginWord == endWord)
			return 1;

		HashSet<String> set1 = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();

		set1.add(beginWord);
		set2.add(endWord);

		hash.remove(beginWord);
		hash.remove(endWord);

		return twoEndBFS(set1, set2, hash, 2);
	}

	private static int twoEndBFS(HashSet<String> set1, HashSet<String> set2, HashSet<String> hash, int count) {

		if (set1.isEmpty() || set2.isEmpty())
			return 0;

		if (set1.size() > set1.size())
			return twoEndBFS(set2, set1, hash, count);

		HashSet<String> temp = new HashSet<>();
		for (String word : set1) {
			char[] wordArray = word.toCharArray();
			for (int i = 0; i < wordArray.length; i++) {
				char ch = wordArray[i];
				for (char newCh = 'a'; newCh <= 'z'; newCh++) {
					wordArray[i] = newCh;
					String newWord = new String(wordArray);
					if (set2.contains(newWord))
						return count;
					if (hash.contains(newWord)) {
						temp.add(newWord);
						hash.remove(newWord);
					}
				}
				wordArray[i] = ch;
			}
		}

		return twoEndBFS(temp, set2, hash, count + 1);
	}

}
