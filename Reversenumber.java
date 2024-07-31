package anudip;
import java.util.*;
public class Reversenumber{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the do you wnt to reverse");
		int nmbr=sc.nextInt();
		
		int lastnmbr,reverse=0;
		//int count=0;
	while(nmbr!=0)
		{ 
		lastnmbr=nmbr%10;
		reverse=(reverse*10)+lastnmbr;
		nmbr=nmbr/10;
		
		}
	System.out.println("the reverse of the nmbr is");
System.out.println(reverse);
	}

}
