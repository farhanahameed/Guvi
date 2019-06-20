import java.util.*;
public class SpecialCount
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int count=0;
		char ch[]=str.toCharArray();
			for(int i=0;i<str.length();i++)
			{
				if(Character.isDigit(ch[i]) || Character.isLetter(ch[i]) || Character.isSpaceChar(ch[i]))
				{
					count=0;
				}
				else
					count++;
			}
		System.out.println(count);
	}
}
