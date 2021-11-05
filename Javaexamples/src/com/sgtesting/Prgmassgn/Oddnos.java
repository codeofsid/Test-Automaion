package com.sgtesting.Prgmassgn;

public class Oddnos {

	public static void main(String[] args) {
		
		
		int count=0;
		for(int i=91;i>=71;i--)
		{
			if(i%2==0)
			{
			count=count+1;
			}
		}
		System.out.println("odd numbers " + count);
		
		int a[]=new int[count];
		int k=0;
		for(int j=91;j<=71;j--)
		{
			if(j%2==0)
			{
				a[k]=j;
				k=k+1;
			}
		for(int z=a.length-1;z>=0;z--)
		{
			System.out.println(a[z]);
		}
		}
	}
}
