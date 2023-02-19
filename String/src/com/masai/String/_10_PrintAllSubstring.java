package com.masai.String;

public class _10_PrintAllSubstring {
	public static void findAllSubs(String string) {
		
		
		int n=string.length();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				for(int k=i; k<=j; k++) {
					System.out.print(string.charAt(k));
				}
				System.out.println();
			}
			
		}
	
		
	}
	
	public static void main(String[] args) {
		String string="abc";
		findAllSubs(string);
		
	}

}
