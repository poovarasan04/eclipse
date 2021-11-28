package com.ARRAY;

public class patten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=3;
int k=0;
for(int i=1;i<=n;i++)
{
	for(int j=n;j>i;j--)
	{
		System.out.print(" ");
	}
	for( k=1;k<=i;k++)
	{
		System.out.print(k);
	}
	for(int c=1;c>=i;c++)
	{
		System.out.print(i++);
	}
	System.out.println();
}
	}

}
