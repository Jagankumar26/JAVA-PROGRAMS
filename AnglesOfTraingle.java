package anudip;
import java.util.*;
public class AnglesOfTraingle {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first angle of traingle");
int a=sc.nextInt();
System.out.println("Enter the 2nd angle of traingle");
int b=sc.nextInt();
System.out.println("Enter the 3rd angle of traingle");
int c=sc.nextInt();
int total=(a+b+c);
if(total==180)
{
	System.out.println("Yes these are angles of traingle");
}
else
{
	System.out.println("total is not 180 then these are not angles of traingle");
}
	}

}
