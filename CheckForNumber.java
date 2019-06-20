import java.util.*;
public class CheckForNumber
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String str=in.next();
		try
		{
		    Integer.parseInt(str);
			System.out.print("Yes");
		}
		catch(Exception e)
		{
		System.out.println("No");
		}
		}
}
