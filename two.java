import java.util.*;
class two
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String str=in.next();
        if(s.length()==str.length())
        {
            System.out.println("isomorphic");
        }
        else
        {
            System.out.println("not isomorphic");
        }
    }
}
