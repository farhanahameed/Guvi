import java.io.*;
//import java.lang.*;
import java.util.*;
public class SearchElArr
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int a[]=new int[n];
		int c=0;
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			if(a[i]==k)
				c=c+1;
		}
		if(c==1)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
