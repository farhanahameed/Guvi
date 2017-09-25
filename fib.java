import java.io.*;
class fib
{
   public static void main(String args[])
   {
   	int a=0,b=1,next,num;
   	num=Integer.parseInt(args[0]);
   	next=a+b;
   	while(next<=num)
   	{
   		System.out.println(next);
   		a=b;
   		b=next;
   		next=a+b;
   	}
   }
	
}
