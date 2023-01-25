package com.masai.String;

public class FirstDriver {

public static void main(String[] args) {
		
		//2011. Final Value of Variable After Performing Operations
		
		/*Input: operations = ["--X","X++","X++"]
				Output: 1*/
		
		String str[]= {"--X","X++","X++"};
		
		int x=0;
		
		for(String s : str) {
			if(s.equals("--X") || s.equals("X--")) {
				x--;
			}
			else {
				x++;
			}
		}
		System.out.println(x);
		
		
		
	}

}
