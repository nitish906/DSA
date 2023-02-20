package com.masai.String;

public class _7_CheckConsonant {
	
	public static void checkConsonant(String string) {
		String bagString="";
		
		for(int i=0; i<string.length(); i++) {
			if(string.charAt(i)=='a' ||string.charAt(i)=='e' ||string.charAt(i)=='i' ||
					string.charAt(i)=='o'|| string.charAt(i)=='u') {
				
				//bagString+=string.charAt(i);
				System.out.println(true);
				break;
			}
			else {
				System.out.println(false);
				break;
			}
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		String string= "ae";
		
		checkConsonant(string);
	}

}
