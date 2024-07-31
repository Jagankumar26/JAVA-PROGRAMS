package anudip;
import java.util.*;
public class DowhileExample {

	public static void main(String[] args) {
		int  a,b;
		boolean c=false;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("enetr the two numbers");
		a=sc.nextInt();
System.out.println("eneter the another number");
	 b=sc.nextInt();
	System.out.println("enter the operation");
	System.out.println("1.addition\n2 2.differnece \n3.multipliacation\n4.division");
	int opertion=sc.nextInt();
	switch(opertion) {
	case 1:System.out.println("sum is "+(a+b));
	break;
	case 2:System.out.println("difference is"+(a-b));
	break;
	case 3:System.out.println("multiplication is"+(a*b));
	break;
	case 4:System.out.println("division is"+(a/b));
	break;
	default:
		System.out.println("invalid operation");
	}
System.out.println("wanna do once more then enter 'true' \n other wise false");
c=sc.nextBoolean();
	
	}while(c==true);
	 	System.out.println("execution ended");
	}
}
 
	

		
		
	

