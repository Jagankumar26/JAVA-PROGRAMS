package anudip;
import java.util.*;
public class DoubledimensionArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] array=new int[3][5];
		System.out.println(" enter the array elements");
		System.out.println("-----------------------------");
for(int i=0;i<3;i++)
{
	for(int j=0;j<5;j++)
		
	{
		array[i][j]=sc.nextInt();
	}
}	
	
	
	System.out.println("the elements are");
		System.out.println("-----------------------------");
for(int row=0;row<3;row++)
{
	for(int col=0;col<5;col++)
		
	{
		System.out.print(array[row][col]+"  ");
	}
	/* for the line change */
	System.out.println("\n");
}

	}

}
