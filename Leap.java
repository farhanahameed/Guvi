import java.io.*;
class Leap
{
	public static void main(String args[])
	{
		int yr;
		yr=Integer.parseInt(args[0]);
		System.out.println("Enter the year"+yr);
		if(((yr%4==0) &&(yr%100!=0))||(yr%400==0))
		{
		System.out.println("The given yr is leap year"+yr);
		}
		else
		{
		System.out.println("The given year is not a leap year"+yr);
		}
	}
}
