package com.ARRAY;

public class greatestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {5,8,9,3,6};
int max=0;
int i=0;
for(;i<a.length;i++)
{
	if(a[i]>max)
	{
		max=a[i];
		
	}
}System.out.print("largest value="+max);

}

	}


