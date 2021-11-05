package com.sgtesting.twodarrayassgn;

public class Stringwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a[][]={{"a","b"},{"c","d"}};		
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


	


