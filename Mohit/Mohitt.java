import java.io.*;
class Tyagi 
{
	int roll_no;
	String name;
	int age;
	String Address;
	int marks;
	String course;
 	Tyagi(int _no, String _name, int _age, String _Address, int _marks, String _course)
  {
	roll_no=_no;
	name= _name;
	age= _age;
	Address= _Address;
	marks= _marks;
	course= _course;
	System.out.println(roll_no+" "+name+" "+age+" "+Address+" "+marks+" "+course);
  }
	
}
class Mohitt 
{ 
	public static void main(String arg[])
  {  
	Tyagi obj1= new Tyagi(1,"Mohit",24,"sonda",78,"MCA");
	Tyagi obj2= new Tyagi(2,"Sparsh",20,"muradnagar",98,"MCA");
  }
}