package anudip;
import java.util.*;
public class GreatstAmong5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st value");
		int a =sc.nextInt();
		System.out.println("enter 2nd value");
		int b=sc.nextInt();
		System.out.println("enter 3rd value");
		int c=sc.nextInt();
		System.out.println("enter 4th value");
		int	d=sc.nextInt();
		System.out.println("enter 5th value");
		int	e=sc.nextInt();
if(a>b&&a>c&&a>d&&a>e) {
	System.out.println(a+"a is greatest");
}
else if(b>a&&b>c&&b>d&&b>e) {
	System.out.println(b+"  b is greatest");
}
else if(c>a&&c>b&&c>d&&c>e) {
	System.out.println(c+" c is greatest");
}

else if(d>a&&d>b&&d>c&&d>e) {
	System.out.println(d+" d is greatest");
}

else  {
	System.out.println(e+" e is greatest");
}



	}

}
