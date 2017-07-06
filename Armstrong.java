import java.io.*;
import java.util.*;
class Armstrong 
{
	public static void main(String args[])
	{
		int i,n,sum,r;
		for(i=1;i<=10;i++)
		{
			n=i;
			sum=0;
			while(n!=0)
			{
				r=n%10;
				sum+=(r*r*r);
				n/=10;
			}
			if(sum==i)
			{
				System.out.println("The number is Armstrong");
			}
			else
			{
				
	            System.out.println("The number is not an Armstrong");
			}
		}
	}
