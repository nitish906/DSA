package com.masai.String;
import java.util.*;
//Question : 3 Count Words

public class _3_CountTheWords {
	public static void countTheWords(String str) {
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==' ') {
				count++
				;
			}
		}
		System.out.println(count+1);
		
		
	}
	
	public static void main(String[] args) {
		String str="Nitish Kumar";
		countTheWords(str);
		
	}

}
