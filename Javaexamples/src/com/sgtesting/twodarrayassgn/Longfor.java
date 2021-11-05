package com.sgtesting.twodarrayassgn;

public class Longfor {

	public static void main(String[] args) {
		 
		long a[][]= {{1,2,3},{4,5,6}};
		
		int rows=a.length;
		int cols=a[0].length;
				
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
					System.out.print(a[i][j]+" ");
			}System.out.println();
		}
	}
}


