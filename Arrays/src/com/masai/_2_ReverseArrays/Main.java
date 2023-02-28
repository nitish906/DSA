package com.masai._2_ReverseArrays;

public class Main {
	public static void reverseArrrays(int[] arr) {
		
		String bagString="";
		
		for(int i=0; i<arr.length; i++) {
			bagString=arr[i]+" "+bagString;
		}
		System.out.println(bagString);
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		
		reverseArrrays(arr);
	}

}
