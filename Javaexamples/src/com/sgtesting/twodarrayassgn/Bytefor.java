package com.sgtesting.twodarrayassgn;

public class Bytefor {

	public static void main(String[] args) {
		
		byte a[][]={{1,2,3},{4,5,6}};
		
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
