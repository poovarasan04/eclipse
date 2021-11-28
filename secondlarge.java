package com.ARRAY;

public class secondlarge 
{
public static void main(String args[]) 
{
	int a[]= {5,8,9,3,6};
	int max=0;
	int b=0;

	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}System.out.println("first large="+max);
	
	for(int j=0;j<a.length;j++)
	{
		if(a[j]>b&&max!=a[j])
		{
			
			b=a[j];	
		}
	}
	System.out.print("second largest="+b);
		}

}
