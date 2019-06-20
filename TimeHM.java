import java.util.*;
public class TimeHM
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int time=in.nextInt();
		int min=0;
		int hour=0;
		if(time<=60)
		{
			System.out.println(min+" "+time);
		}
		else
		{
			hour=time/60;
			min=time%60;
			System.out.print(hour+" "+min);
		}
	}
}
