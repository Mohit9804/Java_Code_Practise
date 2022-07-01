import java.io.*;
class Sample 
{
   int a;
	Sample()
	{
		System.out.println("Default Constructor called");
		}
}
class Test 
{
	public static void main(String arg[])
{
	Sample obj=new Sample();
	System.out.println(obj.a);
	}
}