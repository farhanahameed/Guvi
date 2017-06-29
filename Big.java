import java.io.*;
class Big
{
	public static void main(String args[])
	{
	int a,b,c,large;
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	c=Integer.parseInt(args[2]);
	large=a;
	if(b>large)
	  large=b;
   else if(c>large)
		large=c;
	System.out.println("the largest number among the three is:"+large);
}
}
