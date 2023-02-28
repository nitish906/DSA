package com.masai._1_PrintArrays;

public class Main {
	
	public static void printArrrays(int[] arr) {
		String bagString="";
		for(int i=0; i<arr.length; i++) {
			//System.out.println(arr[i]);
			bagString+=arr[i]+" ";
		}
	
		System.out.println(bagString);
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		
		printArrrays(arr);
	}

}
