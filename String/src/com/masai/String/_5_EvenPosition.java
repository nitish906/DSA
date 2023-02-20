package com.masai.String;

public class _5_EvenPosition {
	
	public static void findEvenPos(String string) {
		String bagString="";
		
		for(int i=0; i<string.length(); i++) {
			if(string.charAt(i)%2==0) {
				bagString+=string.charAt(i);
			}
		}
		System.out.println(bagString);
			
	}
		
		public static void main(String[] args) {
			String string= "ankush";
			findEvenPos(string);
		}
	

}