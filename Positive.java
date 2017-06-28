import java.io.*;
class Positive
{
	public static void main(String args[])
	{
		int num;
		System.out.println("enter the number");
			num=Integer.parseInt(args[1]);
			if(num==0)
			{
				System.out.println("The number is equal to zero");
			}
			else if(num>0)
			{
			System.out.println("The number is positive");
			}
			else if(num<0)
			{
				System.out.println("The number is negative");
			}
		}
	}
