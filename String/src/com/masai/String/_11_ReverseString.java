package com.masai.String;

public class _11_ReverseString {
	public static void reverWords(String[] str) {
		int n=str.length;
		
		String bag="";
		for(int i=0; i<n; i++) {
			bag+=str[i];
		}
		System.out.println(bag.length());
		
	}
	
	public static void main (String[] args) {
		String[] str= {"Welcome to Masia School"};
		   reverWords(str);
	}
}





//Output format :
// Masia School to Welcome