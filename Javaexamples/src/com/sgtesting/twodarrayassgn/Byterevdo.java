package com.sgtesting.twodarrayassgn;

public class Byterevdo {

	public static void main(String[] args) {
		
		byte a[][]={{1,2,3},{4,5,6}};
		
		int rows=a.length;
		int cols=a[0].length;
		
		int i=rows-1;
		do
		{
			int j=cols-1;
			do
			{
				System.out.print(a[i][j]+" ");
				j--;
			}while(j>=0);
			i--;
			System.out.println();
		}while(i>=0);
	}
}

		
