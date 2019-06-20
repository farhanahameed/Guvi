import java.io.*;
//import java.lang.*;
import java.util.*;
public class FirstElement
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int temp=0;
		int a[]=new int[n];
		int c[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			for(int k=j+1;k<n;k++)
			{
				if(a[j]<a[k])
				{
					temp=a[j];
					a[j]=a[k];
					a[k]=temp;
				}
				
			}
			for(int h=0;h<n;h++)
			 {
				 c[h]=a[j];
			 }
		}
		System.out.println(c[n-1]);
		}
}
