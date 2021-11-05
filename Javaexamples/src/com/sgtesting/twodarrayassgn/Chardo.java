package com.sgtesting.twodarrayassgn;

public class Chardo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a[][]={{'a','b'},{'c','d'}};
		
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


	


