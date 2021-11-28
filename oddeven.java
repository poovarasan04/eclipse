package com.ARRAY;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5,6,7,8};
int b=0,c=0;
for(int i=0;i<a.length;i++)
{	
	if(a[i]%2==1)
	{
    b=a[i];
	b=b+a[i];
	
	}
}System.out.println(b);
for(int j=0;j<a.length;j++)
		{
	    if(a[j]%2==0)
	    {
	    	c=a[j];
	    	c=c+a[j];
		}
}System.out.print(c);
	}
}


