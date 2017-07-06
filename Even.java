import java.io.*;
import java.util.*;
class Even
{
	public static void main(String args[])
	{
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		for(int i=a;i<=b;i++)
		{
			if(i%2==0)
			{
			System.out.println(i);
			}
		}
	}
}
