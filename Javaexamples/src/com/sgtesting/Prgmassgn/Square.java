package com.sgtesting.Prgmassgn;

public class Square {

	public static void main(String[] args) {
		
		int sum=0;
		for(int  i=1; i<=10;i++)
		    {
			   sum=sum+1;
			}
				int a[]=new int[sum];
			    int k=0;
				for(int j=1; j<=10;j++)
				 {
				  a[k]=j;
				  k=k+1;
				}
				 for(int z=0; z<a.length; z++)
				    {
							System.out.println(z + " * " + z + " = " + a[z]*a[z]);
					}
		        }
			}

