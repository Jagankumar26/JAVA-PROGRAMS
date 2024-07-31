package anudip;
import java.util.*;
public class GreaterAmongThree {

	public static void main(String[] args) {
		//input through key board
		Scanner sc=new Scanner(System.in);
		//choosing numbers
		System.out.println("Enter the 1st number");
	int a=sc.nextInt();
	System.out.println("Enter the 2nd number");
	int b=sc.nextInt();
    System.out.println("Enter the 3rd number");
	int c=sc.nextInt();
	//finding greatest number using if -else -if conditional statements
	if(a>b&&a>c) {
	System.out.println(a+" is greater among all those");
	         }
	else if(b>a&&b>c)
{
	System.out.println(b+" is greater among all those");}

	else {
		System.out.println(c+" is greater among all those");
	}
}
	}


