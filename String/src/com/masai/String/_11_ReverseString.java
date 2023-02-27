package com.masai.String;

public class _11_ReverseString {
	public static void reverWords(String str) {
		
		int input=str.length();
		String[] words = str.split(" ");
		String outputStr = "";
				for (int i = words.length - 1; i >= 0; i--) {
					outputStr += words[i] + " ";
				}

			System.out.println(outputStr);	
		
		
	}
	
	public static void main (String[] args) {
		String str= "Welcome to Masia School";
		   reverWords(str);
	}
}





//Output format :
// Masia School to Welcome