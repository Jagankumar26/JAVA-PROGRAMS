package anudip;
import java.util.*;
public class FindingAreaAndRectangle {
	//creating method for find the area of rectangle
public static void areaOfRectangle(float lenght,float breadth)
{//formula for area
	float area=lenght*breadth;
	System.out.println("the area of the rectangle is:: "+ area);
}
//creating the method for find the perimeter of the rectangle
public static void perimeterOfRectangle(float lenght,float breadth)
{//formula for primeter
	float perimeter=2*(lenght+breadth);
	System.out.println("the perimeter of the rectangle is ::"+ perimeter);
}
	public static void main(String[] args) {
		//creating object to scanner
		Scanner sc=new Scanner(System.in);
		System.err.println(" enter the lenght of the rectangle(positive only)::");
		//taking two numbers from input
float lenght=sc.nextFloat();
System.out.println(" enter the breadth of the rectangle(postive)::");
float breadth=sc.nextFloat();
//calling area method
areaOfRectangle(lenght,breadth);
//calling perimeter method
perimeterOfRectangle(lenght,breadth);
	}

}
