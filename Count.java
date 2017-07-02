import java.util.*;
class Count {
	public static void main (String[] args) {
	int n=Integer.parseInt(args[0]);
		int count=0;
		while(n>0){
		    n=n/10;
		    count++;
		}
		   System.out.print(count);
	}
}
