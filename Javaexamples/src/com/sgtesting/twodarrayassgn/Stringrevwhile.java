package com.sgtesting.twodarrayassgn;

public class Stringrevwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[][]={{"a","b"},{"c","d"}};	
		
		int rows=a.length;
		int cols=a[0].length;
		
		int i=rows-1;
		while(i>=0)
		{
			int j=cols-1;
			while(j>=0)
			{
				System.out.print(a[i][j]+" ");
				j--;
			}
			i--;
			System.out.println();
		}
	}

}


	


