package com.sgtesting.Prgmassgn;

public class SubstractTwoMatrix {

	public static void main(String[] args) {
		
		
		int a[][]={{2,5},{4,5,}};    
		int b[][]={{1,4},{2,3}}; 		    
		int c[][]=new int[2][2];     
		for(int i=0;i<2;i++)
		{    
		  for(int j=0;j<2;j++)
		  {    
		   c[i][j]=a[i][j]-b[i][j];   
		   System.out.print(c[i][j]+"  ");    
		  }    
		   System.out.println();    
		}
		 System.out.println("--reverse order--");
		
		for(int i=2-1;i>=0;i--)
		{    
		  for(int j=2-1;j>=0;j--)
		  {    
		     
		   System.out.print(c[i][j]+"  ");    
		  }    
		   System.out.println();    
		}
	}
}

	


