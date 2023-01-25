package com.masai.Arrays;

import java.util.*;

public class FirstDriver {

	public static void main(String[] args) {
		
		//1920. Build Array from Permutation
		
		/*Input: nums = [5,0,1,2,3,4]
		  Output: [4,5,0,1,2,3]*/
		
		int nums[]= {5,0,1,2,3,4};
		
		int n=nums.length;
		
		int ans[]= new int[n];
		
		for(int i=0; i<n; i++) {
			ans[i]=nums[nums[i]];
		}
		System.out.print(Arrays.toString(ans)); ; 
		
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	