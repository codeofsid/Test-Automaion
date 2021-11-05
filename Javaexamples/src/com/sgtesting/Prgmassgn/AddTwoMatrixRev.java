package com.sgtesting.Prgmassgn;

public class AddTwoMatrixRev {

	public static void main(String[] args) {
		
		
		int a[][]={{1,3},{2,4,}};    
		int b[][]={{1,4},{4,3}}; 		    
		int c[][]=new int[2][2]; 
		for(int i=0;i<a.length;i++)
		{    
		  for(int j=0;j<b.length;j++)
		  {    
		   c[i][j]=a[i][j]+b[i][j];   
		  }
		}  
		   for(int e=c.length-1;e>=0;e--)
		   {
			   for(int k=c[0].length-1;k>=0;k--)
			   {
				  System.out.print(c[e][k]+" ");    
		   }    
		   System.out.println();    
		}    
		}
	}  


	


