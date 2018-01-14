import java.util.*;
class revnum
{
	public static void main (String[] args)
	{
		Scanner i=new Scanner(System.in);
		int n=i.nextInt();
		int r,s=0;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=s*10+r;
		}
		System.out.println(s);
	}
}
