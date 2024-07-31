package anudip;
import java.util.*;
public class phnNO {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("nter the number");
String no=sc.nextLine();
if(no.charAt(0)=='7'||no.charAt(0)=='8'||no.charAt(0)=='9'||no.charAt(0)=='6')
{
	System.out.println("valid number");
char[] carray=no.toCharArray();
	for(int i=0;i<6;i++)
	{
     
	carray[i]='x';
	}
	for(int i=0;i<10;i++)
	{
	System.out.print(carray[i]);
	}}

else
{
	System.out.println("not valid no");
}
}
}