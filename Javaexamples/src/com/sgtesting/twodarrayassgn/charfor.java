package com.sgtesting.twodarrayassgn;

public class charfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a[][]={{'a','b','c'},{'d','e','f'}};
		
		int rows=a.length;
		int cols=a[0].length;
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
					System.out.print(a[i][j]+" ");
			}System.out.println();
		}System.out.println();
	}
}


	


