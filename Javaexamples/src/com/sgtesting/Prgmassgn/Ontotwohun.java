package com.sgtesting.Prgmassgn;

public class Ontotwohun {

	public static void main(String[] args) {
		
		int count=0;
		for(int i=1;i<=200;i++)
		{
			if(i%9==0)
			{
			count=count+1;
			}
		}
		System.out.println(" Total  numbers " + count);
		
		int a[]=new int[count];
		int k=0;
		for(int j=1;j<=200;j++)
		{
			if(j%9==0)
			{
				a[k]=j;
				k=k+1;
			}
		}
		for(int z=a.length-1;z>=0;z--)
		{
			System.out.println(a[z]);
		}
	}
}


	


