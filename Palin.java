import java.util.*;
import java.io.*;
class Palin
{
	public static void main(String args[])
	{
		int i,n,num,rev=0;
		num=Integer.parseInt(args[0]);
		while(n!=0)
		{
			i=n%10;
			rev=rev*10+i;
			n/=10;
		}
		if(rev==num)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not a palindrome");
		}
	}
}
