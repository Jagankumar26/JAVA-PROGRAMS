package anudip;
import java.util.*;
class Sumof10 {

	public static void main(String[] args) {
		   
			{  
			
			 //to take input
			Scanner sc=new Scanner(System.in);  
	System.out.print("Enter the number of elements you want  ");
	// creating a variable as sum and store 0 
		//int sum=0;
			int n=sc.nextInt();  
			
	      int[] a = new int[n];  
		
		    	System.out.println("the elements are");
		       	for(int i=0; i<n; i++)  
			{ 
		       		
		     a[i]=sc.nextInt();  
			
			}  
		       	System.out.println("Array elements are: ");  
		
			for (int i=0; i<n; i++)   
			{  
				System.out.println("-------------------");  
			System.out.println(a[i]);  
		//	sum=sum+a[i];
			}  
			//System.out.println(sum);
			}  
			
			
		}

	

}
