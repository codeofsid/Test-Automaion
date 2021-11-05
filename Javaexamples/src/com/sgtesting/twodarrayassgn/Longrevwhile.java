package com.sgtesting.twodarrayassgn;

public class Longrevwhile {

	public static void main(String[] args) {
		
		long a[][]={{1,2,3},{4,5,6}};
		
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


	


