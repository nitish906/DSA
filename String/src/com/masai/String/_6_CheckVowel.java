package com.masai.String;

public class _6_CheckVowel {
	public static void findVowel(String string) {
		String bagString="";
		
		for(int i=0; i<string.length(); i++) {
			if(string.charAt(i)=='a' ||string.charAt(i)=='e' ||string.charAt(i)=='i' ||
					string.charAt(i)=='o'|| string.charAt(i)=='u') {
				
				bagString+=string.charAt(i);
			}
			
		}
		if(bagString.equals(1)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		
		
	}
	

	public static void main(String[] args) {
		
		String string="stv";
		findVowel(string);
		
	}

}
