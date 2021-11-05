package com.sgtesting.twodarrayassgn;

public class Doublefor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a[][]= {{1.0,2.0,3.0},{4.0,5.0,6.0}};
		
		int rows=a.length;
		int cols=a[0].length;
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(a[i][j]+"");
			}
			System.out.println();
		}
	}
}
