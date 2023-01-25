package com.masai.Arrays;

import java.util.Arrays;

public class SecondDriver {
	
	public static void main(String[] args) {
		
		//1929. Concatenation of Array
		
		/*
		Input: nums = [1,2,1]
		Output: [1,2,1,1,2,1]
		 */
		
		int nums[]= {1,2,1};
		
		int n=nums.length;
		
		int ans[]=new int[n*2];
		
		for(int i=0;i<n; i++) {
			ans[i]=ans[i+n]=nums[i];
			
		}
		
		System.out.println(Arrays.toString(ans));
		
		
		
		
	}

}
