package com.sgtesting.twodarrayassgn;

public class Charrevdo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a[][]={{'a','b'},{'c','d'}};
		
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

	


