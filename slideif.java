package com.poovarasan;

public class slideif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
for(int r=0;r<=a;r++)
{
	for(int c=a;c>=r;c--)
		if(c!=r)
		{
			System.out.print(" ");
		}else
		{
			System.out.print("*");
		}
	System.out.println();
}
	}

}
