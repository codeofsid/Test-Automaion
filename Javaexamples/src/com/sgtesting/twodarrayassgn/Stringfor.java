package com.sgtesting.twodarrayassgn;

public class Stringfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[][]={{"a","b"},{"c","d"}};
		
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


	


