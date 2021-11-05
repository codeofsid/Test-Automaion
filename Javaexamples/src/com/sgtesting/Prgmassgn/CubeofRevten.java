package com.sgtesting.Prgmassgn;

public class CubeofRevten {

	public static void main(String[] args) {
		
		int sum=0;
		for(int  i=10; i>=1;i--)
		{
		   sum=sum+1;
		}
			int a[]=new int[sum];
			int k=0;
			for(int j=10; j>=1;j--)
			{
						a[k]=j;
					    k=k+1;
			}
					for(int z=0; z<=a.length-1;  z++)
					{
						System.out.println(a[z]+ " * " + a[z] + " * " + a[z] + " = " +a[z]*a[z]*a[z]);
					}
	           }
		}



	


