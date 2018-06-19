import java.io.*;
import java.util.*;
class vowelrem
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String rem= str.replaceAll("[aeiouAEIOU]", "");
        String rev="";
        int len=rem.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+rem.charAt(i);
        }
        System.out.print(rev);
    }
}
