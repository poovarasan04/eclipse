package com.OOPS;

public class methods {
	static int x=5;
	public static void main(String args[])
	{
		oddeven();
		star();
		large();
		factorial();
		prime();
		angle();
		plus();
		primes();
		found();
		vowels();
		assending();
	}
	public static void oddeven()
	{
		int a=10;
	for(int i=0;i<a;i++)
	{
		if(i%2==1)
		{
			System.out.println("   "+i);
		}else if(i%2==0)
		{
			System.out.print(i);
		}
	}
	}
	static void star()
	{
		
		for(int i=1;i<=x;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  *");
			}System.out.println();
		}
		
	}
public static void large()
{
	int a[]= {3,5,7,8,5,6};
	int max=0;
	int secondmax=0;
	{
		for(int i=0;i<a.length;i++)
			if(a[i]>max)
			{
				max=a[i];
			}
	  for(int j=0;j<a.length;j++)
		  if(a[j]>secondmax&&max!=a[j])
		  {
			  secondmax=a[j];
		  }
		
	}
	System.out.println("max="+max);
	System.out.println("secondmax="+secondmax);
}
public static void factorial()
{
	int a=1;
	for(int i=1;i<=x;i++)
	{
		
		a=a*i;
	}
	System.out.println("x factorial is:"+a);
}
public static void prime()
{
	int n=7;
	int a=0;
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			a=1;
			break;			
		}	
	}
	if(a==0)
	{
		System.out.println(n+"=prime no");
	}
	else
	{
		System.out.println(n+"=it is not prime number");
	}
}
public static void angle()
{
	for(int i=1;i<=x;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(i==x||j==1||j==i)
			{
				System.out.print("* ");
			}else
			{
				System.out.print("  ");
			}
		}System.out.println();
	}
}
public static void plus()
{
	int a=3;
	for(int i=1;i<=a;i++)
	{
		for(int j=1;j<=a;j++)
		{
			if(i==a/2+1||j==a/2+1)
			{
				System.out.print("* ");
			}else
			{
				System.out.print("  ");
			}
		}System.out.println();
	}
}
public static void primes()
{
	int n=15;
	
	for(int i=1;i<n;i++)
	{
		boolean x=false;
	
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				x=true;				
			}
		}
		
		if(x==true)
		{
			System.out.println("is not prime");
		}
		else
		{
			System.out.println(i);
			}
		}
	}
public static void found()
{
	int n=3;
	boolean x=false;
	int a[]= {1,2,3,2,6,4};
	for(int i=0;i<a.length;i++)
	{
		if(n==a[i])
		{
			x=true;
		}
		
	}if(x==true)
	{
		System.out.println("number is found");
	}
	else 
	{
		System.out.println("number is not found");
	}
	
}
public static void vowels()
{
	char a[]= {'p','o','o','v','a','r','a','s','a','n'};
	char b[]= {'a','e','i','o','u'};
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
			if(a[i]==b[j])
			{
				System.out.println(a[i]);
			}
	}
}
public static void assending()
{
	int a[]= {5,7,8,3,12,13};
	int temp=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[j]>a[i])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		}
		System.out.println(a[i]);
		
		}
	}
	
}





