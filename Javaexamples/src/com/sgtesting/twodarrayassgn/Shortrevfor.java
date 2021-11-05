package com.sgtesting.twodarrayassgn;

public class Shortrevfor {

	public static void main(String[] args) {
		 
		short a[][]={{1,2,3},{4,5,6}};
		
		int rows=a.length;
		int cols=a[0].length;
		
		for(int i=rows-1;i>=0;i--)
		{
			for(int j=cols-1;j>=0;j--)
			{
					System.out.print(a[i][j]+" ");
					
			}	System.out.println();
		}

	}

}

	

