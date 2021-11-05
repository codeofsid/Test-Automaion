package com.sgtesting.twodarrayassgn;

public class Shortdowhile {

	public static void main(String[] args) {
		
		short a[][]= {{1,2,3},{4,5,6}};
		
		int rows=a.length;
		int cols=a[0].length;
		
		int i=0;
		do
		{
			int j=0;
			do
			{
				 
				System.out.print(a[i][j]+" ");
				j++;
			}while(j<cols);
			System.out.println();
			i++;
		}while(i<rows);
	}
}



	


