package com.sgtesting.twodarrayassgn;

public class Doublerevfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a[][]={{1,2,3},{4,5,6}};
		
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
