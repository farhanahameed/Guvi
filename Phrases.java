import java.io.*;
//import java.lang.*;
import java.util.*;
public class Phrases
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String s=in.next();
		char c[]=s.toCharArray();
		int count1=0;
		int count2=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='(')
			{
				count1=count1+1;
			}
			else if(c[i]==')')
			{
				count2=count2+1;
			}
		}
		if(count1==count2)
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");
	}
}
