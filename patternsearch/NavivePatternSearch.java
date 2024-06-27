package com.wipro.patternsearch;

public class NavivePatternSearch {
	//ABAAABCD ABC
	static void search(String text, String pattern)
	{
		int n = text.length();
		int m = pattern.length();
		
		for(int i = 0; i <= n - m; i++)
		{
			int j;
			
			for(j = 0; j< m; j++)
			{
				if(text.charAt(i + j) != pattern.charAt(j))
				{
					break;
				}
			}
			if(j == m)
			{
				System.out.println("Pattern found at index "+ i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sample text and pattern
		String text = "ABAAABCD";
		String pattern = "ABC";
		
		// Call the search method
		search(text, pattern);
	}

}
