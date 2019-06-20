import java.util.*;
public class MiddArry
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
				if(a[j]>a[k])
				{
					temp=a[k];
					a[k]=a[j];
					a[j]=temp;
				}
				
			}
		}
		int f;
		if(n%2==0)
		{
			f=(n/2);
		}
		else
			f=(n/2)+1;
		
		System.out.println(a[f-1]);
		}
}
