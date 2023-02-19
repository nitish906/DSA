package com.masai.String;

//Question: 2 Print Characters of a string Reverse

public class _2_PrintStringCharReverse {
	public static void findCharacter(String str){
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.println(str.charAt(i));
		}
		
	}
	
	
	public static void main(String[] args) {
		String str="Nitish";
		findCharacter(str);
	}

}
