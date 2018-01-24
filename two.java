import java.util.*;
class two
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String str=in.next();
        if(s.length()>0 && s.length()<100000 || str.length()>0 || str.length()<100000)
        {
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
}
