package com.masai.String;

public class _9_ChckPalindrom {
	public static void checkPalindrom(String string) {
		
		String bagString="";
		
		for(int i=string.length()-1; i>=0; i--) {
			bagString+=string.charAt(i);
		}
		
		if(bagString.equals(string)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	
	public static void main(String[] args) {
		String string="aba";
		checkPalindrom(string);
	}

}
