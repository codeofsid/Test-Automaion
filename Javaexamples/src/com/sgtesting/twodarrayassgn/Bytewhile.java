package com.sgtesting.twodarrayassgn;

public class Bytewhile {

	public static void main(String[] args) {
		
		byte a[][]={{1,2,3},{4,5,6}};
		
		int rows=a.length;
		int cols=a[0].length;
		
		int i=0;
		while(i<rows)
		{
			int j=0;
			while(j<cols)
			{
				 
				System.out.print(a[i][j]+" ");
				j++;
			}System.out.println();
			i++;
		}
	}
}
	
