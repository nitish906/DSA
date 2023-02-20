package com.masai.String;

public class _4_OddPosition {
	
	public static void findOddPos(String string) {
		
		String bagString="";
		
		for(int i=0; i<string.length(); i++) {
			if(string.charAt(i)%2==1) {
				bagString+=string.charAt(i);
			}
		}
		System.out.println(bagString);
		
	}
	
	public static void main(String[] args) {
		String string= "ankush";
		findOddPos(string);
	}
	

}
