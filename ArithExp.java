import java.util.*;
public class ArithExp
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int an[]=new int[n];
		int a=in.nextInt();
		int d=in.nextInt();
		int ans=0;
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
				an[i]=a;
			}
			else
			an[i]=a+(i*d);
		}
		for(int j=0;j<n;j++)
		{
			ans=ans+an[j];
		}
		System.out.println(ans);
		}
}
