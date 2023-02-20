package com.masai.String;

public class _8_CountVowelCons {
	
	public static void countVandC(String string) {
		
		int vCount=0;
		int cCount=0;
		
		for(int i=0; i<string.length();i++) {
			if(string.charAt(i)=='a' ||string.charAt(i)=='e' ||string.charAt(i)=='i' ||
					string.charAt(i)=='o'|| string.charAt(i)=='u') {
				vCount++;
			}
			else {
				cCount++;
			}
		}
		System.out.println(vCount+" "+cCount);
		
	}
	
	
	public static void main(String[] args) {
		String string="ankush";
		countVandC(string);
	}

}
