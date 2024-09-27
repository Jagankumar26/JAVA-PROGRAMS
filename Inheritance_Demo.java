package anudip;
// cration of class with name car
class Car
{
	
	String brand="Mahindra";
	String model="XUV500";
	// method for displaying the details of car
	public void display()
	{
		System.out.println("the car brand is :"+ brand);
		System.out.println("the car model is :"+ model);
		
	}
	//method for car tyres
	public void tyres()
	{
		System.out.println("car is having 4 tyres");
	}
	//method for car colour
	public void colour()
	{
		System.out.println(" car colour is RED");
	}
}
//creating a class and getting features from car class to the derived class
class Mahindhra extends Car{
	int maxspeed=120;
	//method to display the details of the mahindraa
public void mahindracardetails()
{
	System.out.println("this car brand is:"+super.brand);

	System.out.println("this car model is:"+super.model);
	
	
	System.out.println(" the car maximum speed is: "+maxspeed);
	super.colour();
	super.tyres();
}

	
}
//main class
public class Inheritance_Demo {

	public static void main(String[] args) {
		//object creation for mahindra class
		 Mahindhra obj=new Mahindhra(); 
		 //CALLING METHOD FROM MAHINDRA CLASS(DERIVED CLASS)
		 obj.mahindracardetails();

	}

}
