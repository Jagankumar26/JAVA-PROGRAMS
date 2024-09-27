package anudip;
interface ThreeDimension
{
	public void volume();
	public void curvedSurfaceArea();
	public void totalSurfaceArea();
}
class Cylinder implements ThreeDimension
{ 
	float hieght;
	float radius;
	
	Cylinder(float hieght,float radius)
	{
		this.hieght=hieght;
		this.radius=radius;
	}
	public void volume()
	{
		System.out.println(" The area of cylinder is ::");
		System.out.println(3.14f*radius*radius*hieght);
	}
	public void curvedSurfaceArea()
	{
		System.out.println(" The curvedSurfaceArea of cylinder is ::");
		System.out.println(2*3.14f*radius*hieght);
	}
	public void totalSurfaceArea()
	{
		System.out.println(" The totalSurfaceArea of cylinder is ::");
		System.out.println(2*3.14f*radius*(radius+hieght));	
	}
}
public class Interface_example {
public static void main(String args[])
{
	Cylinder cl=new Cylinder(3.0f,4.0f);
	cl.volume();
	cl.curvedSurfaceArea();
	cl.totalSurfaceArea();
	}
}
