package com.basics.atm;

public class atm {

	public static void main(String args[])
	{
		int rs500,rs200,rs100;
		int amt=10300;
		int a,b,c;
		a=amt%500;rs500=amt/500;
		b=a%200;rs200=a/200;
		c=b%100;rs100=b/100;
		if(c==0)
		{
			System.out.println("no of 500:"+rs500);
			System.out.println("no of 200:"+rs200);
			System.out.println("no of 100:"+rs100);
			}
	
	else
	{
		System.out.print("please enter valid amount");
	}

}
}
