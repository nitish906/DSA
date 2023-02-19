package com.masai.String;

//Question: 1. Print the Characters of String


public class _1_PrintStringOfChar {
	public static void findChracter(String str) {
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
	}
	
	public static void main(String[] args) {
		String str="Nitish";
		findChracter(str);
	}

}
