package com.masai.Arrays;

import java.util.Arrays;
import java.util.EnumSet;

public class ThirdDriver {
	
	public static void main(String[] args) {
		
		//1470. Shuffle the Array
		/*
		 * Input: nums = [2,5,1,3,4,7], n = 3
		   Output: [2,3,5,4,1,7]
		 */
		
		int nums[]= {2,5,1,3,4,7};
		
		int n=nums.length;
		
		int ans[]=new int[n];
		
//		for(int i=0; i<n; i++) {
//			ans[i]=nums[i];
//			ans[i+1]=nums[i+n];
//		}
		//System.out.println(ans);
		
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				ans[i]=ans[j];
				ans[i+1]=ans[j+n];
			}
		}
		System.out.println(Arrays.toString(ans));
		
		
	}

}
