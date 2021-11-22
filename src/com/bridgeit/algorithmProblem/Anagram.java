package com.bridgeit.algorithmProblem;

public class Anagram {

	public static void main(String args[]) {

		String str1 = "heart";
		String str2 = "earth";
		int count =0;
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if(str1.charAt(i) == str2.charAt(j)) {
					count++;
					break;
				}
			}
		}
		if (count == str1.length() && count == str2.length())
			System.out.println("The two strings are anagram of each other");
		else
			System.out.println("The two strings are not anagram of each other");
	}
}
