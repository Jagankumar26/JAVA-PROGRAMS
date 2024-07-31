package anudip;
import java.util.*;
public class Arrayofnames {

	public static void main(String[] args) {
		String name;
		Scanner sc=new Scanner(System.in);
		String[] array=new String[6];
		System.out.println(" enter the array elements");
		System.out.println("-----------------------------");
for(int i=0;i<6;i++)
{
		array[i]=sc.nextLine();
	}	
	
	
	System.out.println("the elements are");
		System.out.println("-----------------------------");
		Arrays.sort(array);
for(int i=0;i<6;i++)
{
	System.out.println(array[i]+" ");
	}
System.out.println("the sorted names are");
	
	System.out.println("select a name from the list of names");
 name=sc.nextLine();

for(int i=0;i<6;i++) {
	if(name.equals(array[i]))
	{
		for(int j=i+1;j<6;j++)
		{
		System.out.print(array[j]+" ");
		}
	}
}
}}