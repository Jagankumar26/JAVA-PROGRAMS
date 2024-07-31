package anudip;
import java.util.*;
public class SumOfTwoNumbers {
public static int sum(int a,int b)
{
 	int c=a+b;
	return c;
}

	public static void main(String[] args) {
		//creating object to the scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers to sum");
		System.out.print(" Enter the first number:");
		int num1=sc.nextInt();
		System.out.print(" Enter the first number:");
		int num2=sc.nextInt();
		int result=sum(num1,num2);
		System.out.println("the sum of "+num1 +"and"+num2+"is" + result);
		
		//checking the number sum is positive or negative using if conditional statements
		if(result>0)
		{
			System.out.println(" the sum is a poistive");
		}
		else if(result==0)
		{
		System.out.println("two numbers are equal");	
		}
		else
		{
			System.out.println(" the sum is negative");
		}
	}

}
