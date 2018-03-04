import java.util.Scanner;
class LeaveDay
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String s=str.toLowerCase();
        if(s.equals("Saturday")||s.equals("Sunday"))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
