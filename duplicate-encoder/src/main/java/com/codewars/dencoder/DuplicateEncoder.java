package com.codewars.dencoder;

public class DuplicateEncoder {

	public static String encode(String word) {
		
		StringBuilder output = new StringBuilder("");
		
		for(int i = 0; i < word.length(); i++) {
			if(isThere(word.toLowerCase(), i)) {
				output.append(")");
			}else {
				output.append("(");
			}
			
		}
		return output.toString();
		
		
	}
	
	public static boolean isThere(String word, int atIndex) {
		if(atIndex == 0) {
			if(word.substring(1).contains(word.charAt(atIndex)+"")) {
				return true;
			}
			return false;
		}else {
			if(word.subSequence(0, atIndex).toString().contains(word.charAt(atIndex)+"")) {
				return true;
			}
			if(word.subSequence(atIndex + 1, word.length()).toString().contains(word.charAt(atIndex)+"")) {
				return true;
			}
			return false;
		}
	}
	
}
