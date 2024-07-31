package anudip;
import java.util.*;
public class methodExample {
	//creation of method
public static void evenOrOdd(int x)
{
	//defination of the method
	
//checking the number is even or odd
	if(x%2==0)
	{
		System.out.println(x+", is a even number");
	}
	else 
	{
		System.out.println(x+", it is odd number");
	}
}//main method
	public static void main(String[] args) {
		//decalring scanner class and creation of object for that
	Scanner sc=new Scanner(System.in);
	System.out.println(" enter the number do you want to check::");
	//taking input from the use
int a=sc.nextInt();
//calling a method
evenOrOdd(a);
	}

}
