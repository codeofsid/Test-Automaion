package com.sgtesting.Prgmassgn;

public class Primeonetofifty {

	public static void main(String[] args) {
		
		
		int  count=0;
    	int a=0;
     for (int i = 1; i <=50; i++)         
       {
    	for(int j=2;j<i;j++)
    	 {
           if(i%j==0)
	       {
 		      a=0;
 		      break;
	       }	
           else
           {
        	   a=1;
           }
    	 }
	        if(a!=0)	
	        {
		      count=count+1;			  
	          System.out.print(i+" ");
	        }
       }      
     System.out.println("Prime Numbers from 1 to 50:  " + count);
}

}
