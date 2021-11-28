package com.ARRAY;

public class combine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,6,7,3};
int b[]= {2,3,4};
int c=a.length+b.length;
int d[]=new int[c];
for(int i=0;i<a.length;i++)
{
	d[i]=a[i];
	 
	System.out.print(d[i]);
	
}
for(int j=0;j<b.length;j++)	
{ 
	d[j]=b[j];
    System.out.print(d[j]);
}
	}

}
