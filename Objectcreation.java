package anudip;
class Student
{
	String sname;
	int sid;
	static String name="hello";
	long sphno;
	void fun() {
		System.out.println("student is having fun");
	}
}
public class Objectcreation {

	public static void main(String[] args) {
		
Student obj=new Student();
obj.sname="jagan";
obj.sid=27;
obj.sphno=996360854;
System.out.println(Student.name);
obj.fun();
System.out.println(obj.sname);
System.out.println(obj.sid);
System.out.println(obj.sphno);
	
	}

}
