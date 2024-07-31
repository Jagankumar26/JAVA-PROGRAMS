package anudip;
import java.util.Scanner;
public class LargenumberInarray {

	public static void main(String[] args) {
		int[] array=new int[5];
		Scanner sc=new Scanner(System.in);
	     System.out.println("-------------");
	     for(int i=0;i<4;i++)
	     {
	  array  [i]=sc.nextInt();
	     	}
	     System.out.println("the marks are");
	     System.out.println("-------");
	     for(int i=0;i<4;i++)
	     {
	     	System.out.println(array[i]);
	     	} 
	    int max=array[0];
	  for(int i=1;i<4;i++)   
	  {
		  if(array[i]>max)
		  {
			max=array[i];  
		  }}
	  
		  System.out.println("th max number is"+max);
	  
	}

}
