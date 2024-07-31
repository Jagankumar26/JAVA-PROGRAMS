package anudip;
import java.util.*;
public class ForenheiteTocelcius {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temparature in fahrenhiet");
		float f=sc.nextFloat();
		float c=((f-32)*5)/9;
		System.out.println(" converting after fahrenhiet  To celsius");
		System.out.println(c);

	}

}
